package a1;
import org.junit.Test;
import static org.junit.Assert.*;


//import static org.junit.Assert.assertEquals;
//import com.sun.tools.javac.util.Assert;
//import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    /**
     * Tests the method wholeSum and terminates the program if it fails a test case
     */
    @Test public void wholeSumTest() {
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        float result1 = Main.WholeSum(arr1);
        assertEquals(10.0f, result1, 0.0001f);

        float[] arr2 = {-7.5f, 3.2f};
        float result2 = Main.WholeSum(arr2);
        assertEquals(-4.3f, result2, 0.0001f);

        float[] arr3 = {};
        float result3 = Main.WholeSum(arr3);
        assertEquals(0.0f, result3, 0.0001f);
    }

    /**
     *  Tests both sum methods and terminates the program if it fails a test case
     */
    @Test public void sumTest(){
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo1 = 1;
        int hi1 = 3;
        float result1 = Main.sum(arr1, lo1, hi1);
        assertEquals(5.0f, result1, 0.0001f);

        float[] arr2 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo2 = 0;
        int hi2 = 4;
        float result2 = Main.sum(arr2, lo2, hi2);
        assertEquals(10.0f, result2, 0.0001f);

        float[] arr3 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo3 = 2;
        int hi3 = 2;
        float result3 = Main.sum(arr3, lo3, hi3);
        assertEquals(0.0f, result3, 0.0001f);
    }

    /**
     *  Tests both mean methods and terminates the program if it fails a test case
     */
    @Test public void meanTest(){
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo1 = 2;
        int hi1 = 4;
        float result1 = Main.mean(arr1, lo1, hi1);
        assertEquals(3.5f, result1, 0.0001f);

        float[] arr2 = {1.0f, 2.0f, 3.0f, 4.0f};
        float result2 = Main.mean(arr2);
        assertEquals(2.5f, result2, 0.0001f);

        float[] arr3 = {};
        float result3 = Main.mean(arr3);
        assertEquals(0.0f, result3, 0.0001f);
    }

    /**
     * Tests both min methods and terminates the program if it fails a test case
     */
    @Test public void minTest(){
        float[] arr1 = {1.0f, 3.0f, 2.0f, 4.0f};
        int lo1 = 1;
        int hi1 = 4;
        float result1 = Main.min(arr1, lo1, hi1);
        assertEquals(2.0f, result1, 0.0001f);

        float[] arr2 = {1.0f, 3.0f, 2.0f, 4.0f};
        float result2 = Main.min(arr2);
        assertEquals(1.0f, result2, 0.0001f);

        float[] arr3 = {};
        float result3 = Main.min(arr3);
        assertEquals(Float.NaN, result3, 0.0001f);
    }

    /**
     *  Tests both max methods and terminates the program if it fails a test case
     */
    @Test public void maxTest(){
        float[] arr1 = {1.0f, 3.0f, 2.0f, 4.0f};
        int lo1 = 1;
        int hi1 = 4;
        float result1 = Main.max(arr1, lo1, hi1);
        assertEquals(4.0f, result1, 0.0001f);

        float[] arr2 = {1.0f, 3.0f, 2.0f};
        float result2 = Main.max(arr2);
        assertEquals(3.0, result2, 0.0001f);

        float[] arr3 = {1.0f, 3.0f, 2.0f};
        int lo3 = 0;
        int hi3 = 0;
        float result3 = Main.max(arr3, lo3, hi3);
        assertEquals(Float.NaN, result3, 0.0001f);
    }
}
