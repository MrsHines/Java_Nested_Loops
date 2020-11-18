import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestTri1
{
  public static void main(String args[]) {
    TestTri1 test = new TestTri1();
    test.test3A();
    test.test7X();
    test.test1R();
    test.test5T();
    test.test4W();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestTri1()
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
        assertEquals("A\nAA\nAAA\n", Main.triLet1(3, "A"));
    }
    
    @Test
    public void test7X(){
      assertEquals("X\nXX\nXXX\nXXXX\nXXXXX\nXXXXXX\nXXXXXXX\n", Main.triLet1(7,"X"));
    }

    @Test
    public void test1R(){
      assertEquals("R\n", Main.triLet1(1,"R"));
    }
    
    @Test
    public void test5T(){
      assertEquals("T\nTT\nTTT\nTTTT\nTTTTT\n", Main.triLet1(5, "T"));
    }
    
    @Test
    public void test4W(){
      assertEquals("W\nWW\nWWW\nWWWW\n", Main.triLet1(4, "W"));
    }
    
}
