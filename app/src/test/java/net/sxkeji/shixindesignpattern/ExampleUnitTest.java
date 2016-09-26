package net.sxkeji.shixindesignpattern;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testPrint2dArray(){
        byte[][] array = new byte[][] { { 1, 2, 3 }, { 4, 5 ,6} };
        try {
            log2dArray(array);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void log2dArray(byte[][] array) throws Exception {
        String result = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(array);
        oos.flush();
        oos.close();
//        byte[] b = bos.toByteArray();
        result = bos.toString();
//        Log.i("TEST", result );
        System.out.println("log2dArray" + result);
        return;
    }
}