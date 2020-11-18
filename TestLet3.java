

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestLet3
{
  public static void main(String args[]) {
    TestLet3 test = new TestLet3();
    test.test3A();
    test.test7X();
    test.test1R();
    test.test5T();
    test.test4W();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestLet3()
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
        assertEquals("  A\n AA\nAAA\n", Main.triLet3(3, "A"));
    }
    
    @Test
    public void test7X(){
      assertEquals("      X\n     XX\n    XXX\n   XXXX\n  XXXXX\n XXXXXX\nXXXXXXX\n", Main.triLet3(7,"X"));
    }

    @Test
    public void test1R(){
      assertEquals("R\n", Main.triLet3(1,"R"));
    }
    
    @Test
    public void test5T(){
      assertEquals("    T\n   TT\n  TTT\n TTTT\nTTTTT\n", Main.triLet3(5, "T"));
    }
    
    @Test
    public void test4W(){
      assertEquals("   W\n  WW\n WWW\nWWWW\n", Main.triLet3(4, "W"));
    }
}
