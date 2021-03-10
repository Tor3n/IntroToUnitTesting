import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void test_is_triangle_1() {

        assertTrue(Demo.isTriangle(3,4,5));
    }

    @Test
    public void test_is_triangle_1_1() {

        assertTrue(Demo.isTriangle(1,2,2));
    }

    @Test
    public void test_is_triangle_1_2() {

        assertTrue(Demo.isTriangle(2,1,2));
    }

    @Test
    public void test_is_triangle_1_3() {

        assertTrue(Demo.isTriangle(2,2,1));
    }

    @Test
    public void test_is_triangle_2() {

        assertTrue(Demo.isTriangle(1,1,1));
    }

    @Test
    public void test_is_triangle_4() {

        assertTrue(Demo.isTriangle(2,2,2));
    }

    @Test
    public void test_is_triangle_5() {

        assertFalse(Demo.isTriangle(-2,2,2));
    }

    @Test
    public void test_is_triangle_5_1() {

        assertFalse(Demo.isTriangle(2,-2,2));
    }

    @Test
    public void test_is_triangle_5_2() {

        assertFalse(Demo.isTriangle(2,2,-2));
    }

    @Test
    public void test_is_triangle_6() {

        assertFalse(Demo.isTriangle(1500,2,2));
    }

    @Test
    public void test_is_triangle_6_1() {

        assertFalse(Demo.isTriangle(2,150,2));
    }

    @Test
    public void test_is_triangle_6_2() {

        assertFalse(Demo.isTriangle(2,2,150));
    }

    @Test
    public void test_is_triangle_7() {

        assertTrue(Demo.isTriangle(150,150,2));
    }

    @Test
    public void test_is_triangle_8() {

        assertTrue(Demo.isTriangle(150,2,150));
    }

    @Test
    public void test_is_triangle_9() {

        assertFalse(Demo.isTriangle(0,0,0));
    }

    @Test
    public void test_is_triangle_10() {

        assertFalse(Demo.isTriangle(0,1,1));
    }

    @Test
    public void test_is_triangle_10_1() {

        assertFalse(Demo.isTriangle(1,0,1));
    }

    @Test
    public void test_is_triangle_10_2() {

        assertFalse(Demo.isTriangle(1,1,0));
    }

    @Test
    public void test_is_triangle_11() {

        assertFalse(Demo.isTriangle(10,8,2));
    }

    @Test
    public void test_is_triangle_12() {

        assertFalse(Demo.isTriangle(10,2,8));
    }

    @Test
    public void test_is_triangle_13() {

        assertFalse(Demo.isTriangle(8,10,2));
    }

    @Test
    public void test_is_triangle_14() {

        assertFalse(Demo.isTriangle(8,2,10));
    }

    @Test
    public void test_is_triangle_15() {

        assertFalse(Demo.isTriangle(2,8,10));
    }

    @Test
    public void test_is_triangle_16() {

        assertFalse(Demo.isTriangle(2,10,8));
    }

    @Test
    public void test_main_program(){
        ByteArrayInputStream in = new ByteArrayInputStream("5\n12\n13\n".getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args ={};
        Demo.main(args);

        String consoleOutput = "Enter side 1: "
                +System.getProperty("line.separator")+"Enter side 2: "
                +System.getProperty("line.separator")+"Enter side 3: "
                +System.getProperty("line.separator")+"This is a triangle."
                +System.getProperty("line.separator");
        System.out.println(consoleOutput);
        //assertEquals(consoleOutput,out.toString());
    }

}
