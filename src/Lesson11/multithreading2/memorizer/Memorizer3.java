/*
 * Copyright (c) 2005 Brian Goetz and Tim Peierls
 * Released under the Creative Commons Attribution License
 *   (http://creativecommons.org/licenses/by/2.5)
 * Official home: http://www.jcip.net
 *
 * Any republication or derived work distributed in source code form
 * must include this copyright and license notice.
 */

package Lesson11.multithreading2.memorizer;

import java.util.Map;
import java.util.concurrent.*;

import static Lesson11.multithreading2.memorizer.ThrowableUtils.launderThrowable;

public class Memorizer3<A, V> implements Computable<A, V> {

    private final Map<A, Future<V>> cache = new ConcurrentHashMap<>();
    private final Computable<A, V> computable;

    public Memorizer3(Computable<A, V> computable) {
        this.computable = computable;
    }

    @Override
    public V compute(A arg) throws InterruptedException {
        Future<V> future = cache.get(arg);
        if (future == null) {
            Callable<V> callable = new Callable<V>() {
                @Override
                public V call() throws InterruptedException {
                    return computable.compute(arg);
                }
            };

            FutureTask<V> futureTask = new FutureTask<>(callable);
            future = futureTask;
            cache.put(arg, futureTask);
            futureTask.run();
        }

        try {
            return future.get();
        } catch (ExecutionException e) {
            throw launderThrowable(e.getCause());
        }
    }
}
