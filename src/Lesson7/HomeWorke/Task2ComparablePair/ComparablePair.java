package Lesson7.HomeWorke.Task2ComparablePair;

public class ComparablePair <T extends Comparable<? super T>> {


    private final T firstElem;
    private final T secondElem;

    public ComparablePair(T firstElem, T secondElem) {
        this.firstElem = firstElem;
        this.secondElem = secondElem;
    }

    public T bigger() {
        return (firstElem.compareTo(secondElem) >= 0) ? firstElem:secondElem;
    }

    public T smaller() {
        return (firstElem.compareTo(secondElem) < 0) ? firstElem:secondElem;
    }
}