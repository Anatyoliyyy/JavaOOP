package Lesson2.HomeWorke.Task4Example;

import common.DateUtils;


public class StudentRunner {

    public static void main(String[] args) {
        Students students = createStudents();

        Students studentsFromFICS = students.findByFaculty("FICS");
        System.out.println("Students from FICS: " + studentsFromFICS);

        Students studentsFromCourse4 = students.findByCourse(4);
        System.out.println("Students from course 4: " + studentsFromCourse4);

        Students studentByBirthDate = students.findByBirthDate(DateUtils.getTimestamp(10, 10, 1994));
        System.out.println("Student by birth date: " + studentByBirthDate);
    }

    private static Students createStudents() {
        Students students = new Students();

        students.add(new Student()
                .setName("John")
                .setSurname("Smith")
                .setAddress("John's Address")
                .setPhoneNumber("+38 (095) 111-11-11")
                .setBirthDate(DateUtils.getTimestamp(20, 1, 1995))
                .setFaculty("FICS")
                .setCourse(4)
                .setGroup(3)
        );
        students.add(new Student()
                .setName("Bob")
                .setSurname("Huston")
                .setAddress("Bob's Address")
                .setPhoneNumber("+38 (065) 222-22-22")
                .setBirthDate(DateUtils.getTimestamp(2, 5, 1993))
                .setFaculty("ACTS")
                .setCourse(4)
                .setGroup(5)
        );

        return students;
    }
}
