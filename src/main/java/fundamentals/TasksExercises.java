package fundamentals;

import java.util.Scanner;

public class TasksExercises {
    public static final float pi = (float) Math.PI;
    int x = 10;
    static int y = 1;
    //System.out.println("Hello World");
    //--------------------------------
    //1.Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.

    public static void circlePerimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert diameter: ");
        float diameter = scanner.nextFloat();
        System.out.println("The perimtrer has the folowing size: " + diameter * pi);


    }

    //--------------------------------
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


    //--------------------------------
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

    public static void fizzBuzz1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number ");
        int inputNumber = scanner.nextInt();
        for (int i = 1; i <= inputNumber; i++) {
            if (i % 21 == 0) {
                System.out.println("FizzBuzz " + i);
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz " + i);
                continue;
            }
            if (i % 7 == 0) {
                System.out.println("Buzz " + i);
                continue;
            }
            System.out.println(i);
        }
    }

    //--------------------------------
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

    //--------------------------------
    //  Write an application that will take a positive number from the user (type int)
    //  and calculate the Fibonacci number at the indicated index. For example, if the number
    //  equals 5, your program should print the fifth Fibonacci number. In Fibonacci sequence,
    //  each number is the sum of the two preceding ones.
    public static void fibonacci() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an integer positive number ");
        int inputNumber = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        int fibonacci = 0;
        for (int i = 1; i <= inputNumber; i++) {
            fibonacci = num1 + num2;
            num1 = num2;
            num2 = fibonacci;
            System.out.println(fibonacci + " ");
        }
        System.out.println("\n The number you are looking for in Fibonacci sequence is  " + fibonacci);
    }

    //--------------------------------
    //4.Write an application that gets one positive number (type int) from the user
    // and calculates a sum of digits of the given number. Hint: to make some operations
    // on every single digit of the number (digit by digit), you can calculate the remainder
    // of dividing the number by 10 (to get the value of the last digit) and divide the
    // number by 10 (to "move" to the next digit).
    public static void digitSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an integer positive number ");
        int a = scanner.nextInt();
        int b, sum, temp;
        b = a;
        sum = 0;
        do {
            temp = a % 10;
            sum = sum + temp;
            a = a / 10;
        }
        while (a > 0);
        System.out.println("the sum of digits of the given number  " + b + " = " + sum);
    }


    //--------------------------------
    //NU AM STIUT CUM SA REZOLV!!
    //5.Write an application that will read texts (variables of the String type) until the user
// gives the text "Enough!" and then writes the longest of the given texts (not including the
// text "Enough!"). If the user does not provide any text, write "No text provided".
//    public static void readTexts() {
//
    public static void longestWorld() {
        System.out.println("Type your world: ");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWorld1 = "";
        do {
            word = scanner.next();
            if (!word.equals("Enough") && longestWorld1.length() < word.length()) {
                longestWorld1 = word;
            }
        } while (!word.equals("Enough"));
        if (longestWorld1.length() == 0) {
            System.out.println("No text provide ");
            return;
        }
        System.out.println("The longest word is " + longestWorld1);

    }

    //sau
    public static void longestWorld1() {
        System.out.println("Type your world: ");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWorld1 = "";
        do {
            word = scanner.next();
            if (longestWorld1.length() < word.length() && !word.equals("Enough")) {
                longestWorld1 = word;
            }
        } while (!word.equals("Enough"));
        if (longestWorld1.length() == 0) {
            System.out.println("No text provide ");
            return;
        }
        System.out.println("The longest word is " + longestWorld1);

    }
//sau

    public static void longestWorld2() {
        System.out.println("Type your world: ");
        Scanner scanner = new Scanner(System.in);
        String word = "";
        String longestWorld1 = "";
        while (!word.equals("Enough")) {
            if (longestWorld1.length() < word.length()) {
                longestWorld1 = word;
            }
            word = scanner.next();
        }
        if (longestWorld1.length() == 0) {
            System.out.println("No text provide ");
            return;
        }
        System.out.println("The longest word is: " + longestWorld1);

    }


    //--------------------------------
    //6.Write an application that reads a text from the user (type String) and counts a
    // percentage of occurrences of a space character.
    public static void percetageOfOccurrences() {
        System.out.println("Insert your text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char space = ' ';
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == space) {
                counter++;
            } else continue;
        }
        System.out.println("The percentage of occurences of space character is "
                + ((float) counter * 100 / (float) text.length()) + "%");
    }
    //--------------------------------
    //7. Write an application that "stutters", that is, reads the user's text (type String),
    // and prints the given text, in which each word is printed twice. For example, for the
    // input: "This is my test" the application should print "This This is is my my test test".

    public static void stuttersText() {
        System.out.println("Insert your text");
        Scanner scanner = new Scanner(System.in);
        String textLine = scanner.nextLine();
        String temp = "";
        for (int i = 0; i < textLine.length(); i++) {
            if (textLine.charAt(i) == ' ') {
                System.out.print(temp + " " + temp + " ");
                temp = "";
            } else {
                temp = temp + textLine.charAt(i);
            }
        }
        System.out.println(temp + " " + temp);
    }
    //Write an application that takes a positive number from the user (type int)
    // and prints all prime numbers greater than 1 and less than the given number.

    public static void printAllPrimeNumbers() {
        System.out.println("Give me a number ");
        Scanner scanner = new Scanner(System.in);
        int newNumber = scanner.nextInt();
        if (newNumber <= 1) {
            System.out.println("The number is not greater than 1 ");
            return;
        }
        for (int i = 2; i < newNumber; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        //  System.out.println("a");
    }

    private static boolean isPrime(int nr) {
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime1(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                isPrimeNo = false;
                break;
            }
        }
        return isPrimeNo;

    }

    private static boolean isPrime2(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i != 0) {
                continue;
            }
            isPrimeNo = false;
            break;

        }
        return isPrimeNo;

    }

    private static boolean isPrime3(int nr) {
        if (nr == 2) {
            return true;
        }
        if (nr % 2 == 0 || nr == 1 || nr == 1) {
            return false;
        }
        for (int i = 3; i * i <= nr; i += 2) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    //-----------------------------------------------------
    //12.Write an application that "stutters", that is, reads the user's text (type String), and prints
    //the given text, in which each word is printed twice.
    //For example, for the input: "This is my test" the application should print "This This is is
    //my my test test".

    public void stutters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your word: ");

        String text = scanner.nextLine();
        String[] words = text.split(" ");//initializam un array cu split

        System.out.println("Stutter");

        for (int i = 0; i < words.length - 1; i++) {
            System.out.println(words[i] + " " + words[i] + " ");
        }
        System.out.println(words[words.length - 1] + " " + words[words.length - 1] + " ");
    }

    //teste string-------------------------
    public void testString() {
        String s1 = "abc", s2 = "abc", s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }


    //test objects
    public void testObjects() {
        Dog dog1 = new Dog("Azorel");
        dog1.setName("Azorel");

        Dog dog2 = new Dog("Azorel");
        dog2.setName("Azorel");

        System.out.println(dog1 == dog2);           //ponteaza spre alte zone de memorie ==verifica referintele(sunt in steck) in cazul nostru dog1 si dog2
        System.out.println(dog1.equals(dog2));    //eguals compara continutul
        System.out.println(dog1.getName().equals(dog2.getName()));
    }

}
