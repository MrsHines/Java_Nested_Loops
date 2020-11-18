

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestLet2
{
  public static void main(String args[]) {
    TestLet2 test = new TestLet2();
    test.test3A();
    test.test7X();
    test.test1R();
    test.test5T();
    test.test4W();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestLet2()
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
    public void test3A() {
        assertEquals("AAA\nAA\nA\n", Main.triLet2(3, "A"));
    }
    
    @Test
    public void test7X(){
      assertEquals("XXXXXXX\nXXXXXX\nXXXXX\nXXXX\nXXX\nXX\nX\n", Main.triLet2(7,"X"));
    }

    @Test
    public void test1R(){
      assertEquals("R\n", Main.triLet2(1,"R"));
    }
    
    @Test
    public void test5T(){
      assertEquals("TTTTT\nTTTT\nTTT\nTT\nT\n", Main.triLet2(5, "T"));
    }
    
    @Test
    public void test4W(){
      assertEquals("WWWW\nWWW\nWW\nW\n", Main.triLet2(4, "W"));
    }
}
