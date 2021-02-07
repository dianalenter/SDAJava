package testing.fundamentals;

public class Main {
    public static void main(String[] args) {
        ArrayStringsExercises arrayEx = new ArrayStringsExercises();

        String text = "ala bala portocala";
        String text2 = arrayEx.changeSpaceInString(text);

        System.out.println(text2);
    }
}
