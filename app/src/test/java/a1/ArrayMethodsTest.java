package a1;
import org.junit.Test;
import static org.junit.Assert.*;


//import static org.junit.Assert.assertEquals;
//import com.sun.tools.javac.util.Assert;
//import static org.junit.jupiter.api.Assertions.*;

public class ArrayMethodsTest {
    /**
     * Tests the method wholeSum and terminates the program if it fails a test case
     */
    @Test public void wholeSumTest() {
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        float result1 = ArrayMethods.WholeSum(arr1);
        assertEquals(10.0f, result1, 0.0001f);

        float[] arr2 = {-7.5f, 3.2f};
        float result2 = ArrayMethods.WholeSum(arr2);
        assertEquals(-4.3f, result2, 0.0001f);

        float[] arr3 = {};
        float result3 = ArrayMethods.WholeSum(arr3);
        assertEquals(0.0f, result3, 0.0001f);

        float[] arr4 = {1.0f};
        float result4 = ArrayMethods.WholeSum(arr4);
        assertEquals(1.0f, result4, 0.0001f);

        float[] arr5 = {4.0f, 3.0f, 1.0f, 0.0f};
        float result5 = ArrayMethods.WholeSum(arr5);
        assertEquals(8.0f, result5, 0.0001f);
    }

    /**
     *  Tests both sum methods and terminates the program if it fails a test case
     */
    @Test public void sumTest(){
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo1 = 1;
        int hi1 = 3;
        float result1 = ArrayMethods.sum(arr1, lo1, hi1);
        assertEquals(5.0f, result1, 0.0001f);

        float[] arr2 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo2 = 0;
        int hi2 = 4;
        float result2 = ArrayMethods.sum(arr2, lo2, hi2);
        assertEquals(10.0f, result2, 0.0001f);

        float[] arr3 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo3 = 2;
        int hi3 = 2;
        float result3 = ArrayMethods.sum(arr3, lo3, hi3);
        assertEquals(0.0f, result3, 0.0001f);

        float[] arr4 = {1.0f};
        float result4 = ArrayMethods.sum(arr4);
        assertEquals(1.0f, result4, 0.0001f);

        float[] arr5 = {4.0f, 3.0f, 1.0f, 0.0f};
        float result5 = ArrayMethods.sum(arr5);
        assertEquals(8.0f, result5, 0.0001f);

    }

    /**
     *  Tests both mean methods and terminates the program if it fails a test case
     */
    @Test public void meanTest(){
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo1 = 2;
        int hi1 = 4;
        float result1 = ArrayMethods.mean(arr1, lo1, hi1);
        assertEquals(3.5f, result1, 0.0001f);

        float[] arr2 = {1.0f, 2.0f, 3.0f, 4.0f};
        float result2 = ArrayMethods.mean(arr2);
        assertEquals(2.5f, result2, 0.0001f);

        float[] arr3 = {};
        float result3 = ArrayMethods.mean(arr3);
        assertEquals(0.0f, result3, 0.0001f);

        float[] arr4 = {1.0f};
        float result4 = ArrayMethods.mean(arr4);
        assertEquals(1.0f, result4, 0.0001f);

        float[] arr5 = {4.0f, 3.0f, 1.0f, 0.0f};
        float result5 = ArrayMethods.mean(arr5);
        assertEquals(2.0f, result5, 0.0001f);
    }

    /**
     * Tests both min methods and terminates the program if it fails a test case
     */
    @Test public void minTest(){
        float[] arr1 = {1.0f, 3.0f, 2.0f, 4.0f};
        int lo1 = 1;
        int hi1 = 4;
        float result1 = ArrayMethods.min(arr1, lo1, hi1);
        assertEquals(2.0f, result1, 0.0001f);

        float[] arr2 = {1.0f, 3.0f, 2.0f, 4.0f};
        float result2 = ArrayMethods.min(arr2);
        assertEquals(1.0f, result2, 0.0001f);

        float[] arr3 = {};
        float result3 = ArrayMethods.min(arr3);
        assertEquals(Float.NaN, result3, 0.0001f);

        float[] arr4 = {0.7f};
        float result4 = ArrayMethods.min(arr4);
        assertEquals(0.7f, result4, 0.0001f);

        float[] arr5 = {0.16f, 0.2f, 0.003f, 0.04f, 0.001f};
        int lo5 = 0;
        int hi5 = 3;
        float result5 = ArrayMethods.min(arr5, lo5, hi5);
        assertEquals(0.003f, result5, 0.0001f);

    }

    /**
     *  Tests both max methods and terminates the program if it fails a test case
     */
    @Test public void maxTest(){
        float[] arr1 = {1.0f, 3.0f, 2.0f, 4.0f};
        int lo1 = 1;
        int hi1 = 4;
        float result1 = ArrayMethods.max(arr1, lo1, hi1);
        assertEquals(4.0f, result1, 0.0001f);

        float[] arr2 = {1.0f, 3.0f, 2.0f};
        float result2 = ArrayMethods.max(arr2);
        assertEquals(3.0, result2, 0.0001f);

        float[] arr3 = {1.0f, 3.0f, 2.0f};
        int lo3 = 0;
        int hi3 = 0;
        float result3 = ArrayMethods.max(arr3, lo3, hi3);
        assertEquals(Float.NaN, result3, 0.0001f);

        float[] arr4 = {0.01f};
        float result4 = ArrayMethods.max(arr4);
        assertEquals(0.01f, result4, 0.0001f);

        float[] arr5 = {10.0f, 6.0f, 4.0f, 3.5f, 20.0f};
        int lo5 = 1;
        int hi5 = 4;
        float result5 = ArrayMethods.max(arr5, lo5, hi5);
        assertEquals(6.0f, result5, 0.0001f);
    }
}
