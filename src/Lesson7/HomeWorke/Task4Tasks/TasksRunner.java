package Lesson7.HomeWorke.Task4Tasks;

import java.time.LocalDateTime;

public class TasksRunner {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        addTasks(tasks);

        tasks.sort(TaskComparators.byDeadline());
        System.out.println(tasks);//tasks order: 4, 5, 1, 7, 6, 2, 3

        tasks.sort(TaskComparators.byPriority());
        System.out.println(tasks);//tasks order: 5, 2, 6, 3, 4, 1, 7

        tasks.sort(TaskComparators.byName());
        System.out.println(tasks);//tasks order: 1, 2, 3, 4, 5, 6, 7

        System.out.println(tasks.filter(TaskPredicates.hasExpiredDeadline()));// will return tasks 1, 4, 5, 6, 7
        System.out.println(tasks.filter(TaskPredicates.hasPriority(Priority.MAJOR)));//will return tasks 1, 4, 7
        System.out.println(tasks.filter(TaskPredicates.nameContains("6")));//will return task 6
    }

    public static void addTasks(Tasks tasks) {
        tasks.add(new Task(123, "Task1", "do something1",
                LocalDateTime.of(2018,03, 28, 12, 24), Priority.MAJOR));

        tasks.add(new Task(1234, "Task2", "do something2",
                LocalDateTime.of(2018,04, 8, 12, 30), Priority.MINOR));

        tasks.add(new Task(1235, "Task3", "do something3",
                LocalDateTime.of(2018,05, 2, 12, 24), Priority.NORMAL));

        tasks.add(new Task(1236, "Task4", "do something4",
                LocalDateTime.of(2018,02, 8, 15, 24), Priority.MAJOR));

        tasks.add(new Task(1237, "Task5", "do something5",
                LocalDateTime.of(2018,03, 28, 12, 20), Priority.MINOR));

        tasks.add(new Task(1238, "Task6", "do something6",
                LocalDateTime.of(2018,04, 01, 12, 24), Priority.NORMAL));

        tasks.add(new Task(1239, "Task7", "do something7",
                LocalDateTime.of(2018,04, 01, 12, 05), Priority.MAJOR));
    }
}


//Tasks{tasks=[Task{, name='Task4', deadline=2018-02-08T15:24, priority=MAJOR}
//, Task{, name='Task5', deadline=2018-03-28T12:20, priority=MINOR}
//, Task{, name='Task1', deadline=2018-03-28T12:24, priority=MAJOR}
//, Task{, name='Task7', deadline=2018-04-01T12:05, priority=MAJOR}
//, Task{, name='Task6', deadline=2018-04-01T12:24, priority=NORMAL}
//, Task{, name='Task2', deadline=2018-04-08T12:30, priority=MINOR}
//, Task{, name='Task3', deadline=2018-05-02T12:24, priority=NORMAL}
//]}
//
//Tasks{tasks=[Task{, name='Task5', deadline=2018-03-28T12:20, priority=MINOR}
//, Task{, name='Task2', deadline=2018-04-08T12:30, priority=MINOR}
//, Task{, name='Task6', deadline=2018-04-01T12:24, priority=NORMAL}
//, Task{, name='Task3', deadline=2018-05-02T12:24, priority=NORMAL}
//, Task{, name='Task4', deadline=2018-02-08T15:24, priority=MAJOR}
//, Task{, name='Task1', deadline=2018-03-28T12:24, priority=MAJOR}
//, Task{, name='Task7', deadline=2018-04-01T12:05, priority=MAJOR}
//]}
//
//Tasks{tasks=[Task{, name='Task1', deadline=2018-03-28T12:24, priority=MAJOR}
//, Task{, name='Task2', deadline=2018-04-08T12:30, priority=MINOR}
//, Task{, name='Task3', deadline=2018-05-02T12:24, priority=NORMAL}
//, Task{, name='Task4', deadline=2018-02-08T15:24, priority=MAJOR}
//, Task{, name='Task5', deadline=2018-03-28T12:20, priority=MINOR}
//, Task{, name='Task6', deadline=2018-04-01T12:24, priority=NORMAL}
//, Task{, name='Task7', deadline=2018-04-01T12:05, priority=MAJOR}
//]}
//
//Tasks{tasks=[Task{, name='Task1', deadline=2018-03-28T12:24, priority=MAJOR}
//, Task{, name='Task2', deadline=2018-04-08T12:30, priority=MINOR}
//, Task{, name='Task3', deadline=2018-05-02T12:24, priority=NORMAL}
//, Task{, name='Task4', deadline=2018-02-08T15:24, priority=MAJOR}
//, Task{, name='Task5', deadline=2018-03-28T12:20, priority=MINOR}
//, Task{, name='Task6', deadline=2018-04-01T12:24, priority=NORMAL}
//, Task{, name='Task7', deadline=2018-04-01T12:05, priority=MAJOR}
//]}
//
//Tasks{tasks=[Task{, name='Task1', deadline=2018-03-28T12:24, priority=MAJOR}
//, Task{, name='Task4', deadline=2018-02-08T15:24, priority=MAJOR}
//, Task{, name='Task7', deadline=2018-04-01T12:05, priority=MAJOR}
//]}
//
//Tasks{tasks=[Task{, name='Task6', deadline=2018-04-01T12:24, priority=NORMAL}
//]}
//
//
//Process finished with exit code 0