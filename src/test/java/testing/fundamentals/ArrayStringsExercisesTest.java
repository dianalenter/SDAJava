package testing.fundamentals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class ArrayStringsExercisesTest {
    @Test
    void schuldReplaceSpaceInString() {

        //Given
        String text3 = "textul testat de noi";
        String expectedResult = "textul:testat:de:noi";
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        ArrayStringsExercises arrayEx = new ArrayStringsExercises();
        //When
        String actualResult = arrayEx.changeSpaceInString(text3);
        //Then
        assertEquals(expectedResult, actualResult);


    }

    @Test
    void shouldTheAppendLength() {
        //Given
        String inputText = "Characters";
        String expectedResult = "Characters10";
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        String actualResult = arrayStringsExercises.appendsLength(inputText);
        System.out.println("actual result = " + actualResult);
        //Then
        assertEquals(expectedResult, actualResult);
        assertThat(actualResult).endsWith("10");

    }

    @Test
    void shouldReplaceEvenNumbers() {
        //Given
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expectedArray = {1, 1, 3, 2, 5, 3};
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        int[] resultedArray = arrayStringsExercises.replaceEvenNumbers(array);
        //Then
        assertArrayEquals(expectedArray, resultedArray);
    }

    @Test
    void shouldFindMinElement() {
        //Given
        int[] array = {2, 3, 4, 1, 4, 5};
        int expectedResult = 3;
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        int actualResult = arrayStringsExercises.findPositionOfMinElement(array);
        //Then
        assertEquals(expectedResult, actualResult);


    }

    @Test
    void shouldReturnDefoultValueFotEmptyArray() {
        //Given
        int[] array = {};
        int expectedResult = -1;
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        int actualResult = arrayStringsExercises.findPositionOfMinElement(array);
        //Then
        assertEquals(expectedResult, actualResult);

    }

    @Test
    void shouldReturnPositionOfEqualsElements() {
        //Given
        int[] array = {};
        int expectedResult = -1;
        ArrayStringsExercises arrayStringsExercises = new ArrayStringsExercises();
        //When
        int actualResult = arrayStringsExercises.findPositionOfMinElement(array);
        //Then
        assertEquals(expectedResult, actualResult);
    }
}