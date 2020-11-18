import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestLetNum
{
  public static void main(String args[]) {
    TestLetNum test = new TestLetNum();
    test.testC4();
    test.testA5();
    test.testX6();
  }
    /**
     * Default constructor for test class TestMain
     */
    public TestLetNum()
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
    public void testC4() {
        assertEquals("CCCC DDD EE F \nCCCC DDD EE \nCCCC DDD \nCCCC \n", Main.letAndNum('C', 4));
    }
    
    @Test
    public void testA5(){
      assertEquals("AAAAA BBBB CCC DD E \nAAAAA BBBB CCC DD \nAAAAA BBBB CCC \nAAAAA BBBB \nAAAAA \n", Main.letAndNum('A', 5));
    }

    @Test
    public void testX6(){
      assertEquals("XXXXXX YYYYY ZZZZ AAA BB C \nXXXXXX YYYYY ZZZZ AAA BB \nXXXXXX YYYYY ZZZZ AAA \nXXXXXX YYYYY ZZZZ \nXXXXXX YYYYY \nXXXXXX \n", Main.letAndNum('X', 6));
    }
    
    
}
