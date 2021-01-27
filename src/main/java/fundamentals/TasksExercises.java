package fundamentals;

import java.util.Scanner;

public class TasksExercises {
    public static final float pi = (float) Math.PI;
    int x = 10;
    static int y = 1;
    //System.out.println("Hello World");
    //1.Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.

    public static void circlePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter: ");
        float diameter = scanner.nextFloat();
        System.out.println("The perimtrer has the folowing size: " + diameter * pi);


    }

    //2 Write an application calculating BMI (Body Mass Index)
    // and checking if itЀs optimal or not. Your application
    // should read two variables: weight (in kilograms, type
    // float) and height (in centimeters, type int). BMI should
    // be calculated given following formula: weight/height(m)^2
    // The optimal BMI range is from 18.5 to 24.9, smaller or
    // larger values are non-optimal values. Your program
    // should write "BMI optimal" or "BMI not optimal",
    // according to the assumptions above.
    public static void bMI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your weight in kg. ? ");
        double weight = scanner.nextDouble();
        System.out.println("\nWhat is your height in m.  ");
        double height = scanner.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("\n The BMI is " + BMI + "kg/m2");
        if ((BMI < 18.5) && (BMI < 24.9)) {
            System.out.println("BMI optimal ");
        } else {
            System.out.println("BMI not optimal ");

        }
    }

    //3.Write an application that takes a positive number from the user
    // (type int) and writes all numbers from 1 to the given number, each
    // on the next line, with the following changes:
    //● in place of numbers divisible by 3, instead of a number the program
    // should print "Fizz"
    // ● in place of numbers divisible by 7, instead of a number the program
    // should write "Buzz"
    // ● if the number is divisible by both 3 and 7, the program should print
    // "Fizz buzz"
    public static void fizzBuzz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number ");
        int inputNumber = scanner.nextInt();
        for (int i = 1; i <= inputNumber; i++) {
            if (i % 21 == 0) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 7 == 0) {
                System.out.println("Buzz " + i);
            } else {
                System.out.println(i);
            }

        }

    }

    //4.Write an application that takes a positive number from the user (type int)
    // and prints all prime numbers greater than 1 and less than the given number.
    public void primeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number ");
        int inputNumber = scanner.nextInt();
        for (int i = 2; i <= inputNumber; i++) {
            int j = 0;
            for (int k = 1; k <= i; k++) {
                if (i % k == 0) {
                    j++;
                }
            }
            if (j <= 2) {
                System.out.println(i + "is a prime number");
            }
        }

    }
}
