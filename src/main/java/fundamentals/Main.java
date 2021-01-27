package fundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //static vs/non- static fields and mathod

        TasksExercises tasksExercises1 = new TasksExercises();
       /*   TasksExercises tasksExercises2 = new TasksExercises();
        System.out.println("x = " + tasksExercises1.x);
        System.out.println("x = " + tasksExercises2.x);
        System.out.println("y = " + tasksExercises1.y);
        System.out.println("y = " + tasksExercises2.y);
        tasksExercises1.x = 22;
        TasksExercises.y = 3;
       // TasksExercises.pi = 4.5;
        System.out.println("x = " + tasksExercises1.x);
        System.out.println("x = " + tasksExercises2.x);
        System.out.println("y = " + tasksExercises1.y);
        System.out.println("y = " + tasksExercises2.y);

        //Task 1
        tasksExercises1.circlePerimeter();

//        tasksExercises.circlePerimeter();
//        TasksExercises.circlePerimeter();
//        System.out.println(tasksExercises.x);
//
//        TasksExercises.circlePerimeter();
//        System.out.println(TasksExercises.x);*/
        tasksExercises1.bMI();
        tasksExercises1.fizzBuzz();
        tasksExercises1.primeNumbers();
    }
}
