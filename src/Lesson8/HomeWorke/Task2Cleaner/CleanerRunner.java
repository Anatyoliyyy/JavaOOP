package Lesson8.HomeWorke.Task2Cleaner;

import Lesson7.HomeWorke.Task4Tasks.Priority;
import Lesson7.HomeWorke.Task4Tasks.TaskPredicates;
import Lesson7.HomeWorke.Task4Tasks.Tasks;
import Lesson7.HomeWorke.Task4Tasks.TasksRunner;

import java.util.ArrayList;
import java.util.List;

public class CleanerRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add(null);
        list.add("carrot");

        System.out.println(list); // [apple, banana, null, carrot]

        Cleaner.removeNulls(list);
        System.out.println(list); // [apple, banana, carrot]

        System.out.println();

        Tasks tasks = new Tasks();
        TasksRunner.addTasks(tasks);
        Cleaner.remove(tasks.getTasks(), TaskPredicates.hasPriority(Priority.MAJOR));
        System.out.println(tasks); // will return tasks 2, 3, 5, 6
    }
}

//[apple, banana, null, carrot]
//[apple, banana, carrot]
//
//Tasks{tasks=[Task{, name='Task2', deadline=2018-04-08T12:30, priority=MINOR}
//, Task{, name='Task3', deadline=2018-05-02T12:24, priority=NORMAL}
//, Task{, name='Task5', deadline=2018-03-28T12:20, priority=MINOR}
//, Task{, name='Task6', deadline=2018-04-01T12:24, priority=NORMAL}
//]}
//
//
//Process finished with exit code 0