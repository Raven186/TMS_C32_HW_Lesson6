package coms.teachmeskills.c32.lesson6;

import java.util.Arrays;

public class Task_1 {
    public static void task_1() {


        Student[] students = {
                new Student("Alexandr", "Ivanov", 1234, "9A"),
                new Student("Andrey", "Ivantsov", 5678, "9B"),
                new Student("Sultan", "Samedov", 9012, "9C")
        };

        Arrays.stream(students).forEach(student -> student.showInfo());
    }
}
