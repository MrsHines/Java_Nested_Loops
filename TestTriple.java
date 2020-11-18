

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestTriple
{
  public static void main(String args[]) {
    TestTriple test = new TestTriple();
    test.test28();
    test.test10();
    test.test20();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestTriple()
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
    public void test28() {
        assertEquals("3 4 5\n5 12 13\n7 24 25\n8 15 17\n", Main.triple(28));
    }
    
    @Test
    public void test10(){
      assertEquals("3 4 5\n", Main.triple(10));
    }

    @Test
    public void test20(){
      assertEquals("3 4 5\n5 12 13\n8 15 17\n", Main.triple(20));
    }

  
    
    
}
