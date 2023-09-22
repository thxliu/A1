package a1;
import static org.junit.Assert.*;
import org.junit.Test;

//import static org.junit.Assert.assertEquals;
//import com.sun.tools.javac.util.Assert;
//import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test public void wholeSumTest() {
        float[] arr1 = {1.0f, 2.0f, 3.0f, 4.0f};
        float results = Main.WholeSum(arr1);
        assertEquals(10.0f, results, 0.0001f);
    }

    public static void main(String[] args) {
        
    }
}
