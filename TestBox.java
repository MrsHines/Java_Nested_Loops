

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestBox
{
    public static void main(String args[]) {
        TestBox test = new TestBox();
        test.test3();
        test.test4();
        test.test5();
        test.test2();
        test.test1();
    }
    
    /**
     * Default constructor for test class TestMain
     */
    public TestBox()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void test3() {
        assertEquals("***#\n**##\n*###\n", Main.box(3));
    }
    
    @Test
    public void test4(){
      assertEquals("****#\n***##\n**###\n*####\n", Main.box(4));
    }

    @Test
    public void test5(){
      assertEquals("*****#\n****##\n***###\n**####\n*#####\n", Main.box(5));
    }
    
    @Test
    public void test2() {
        assertEquals("**#\n*##\n", Main.box(2));
    }
    
    @Test
    public void test1(){
      assertEquals("*#\n", Main.box(1));
    }
    
}
