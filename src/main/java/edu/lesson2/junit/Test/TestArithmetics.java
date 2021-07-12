package edu.lesson2.junit.Test;

import edu.lesson2.junit.Calculation.Arithmetics;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics {
    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void runT() {
        a = new Arithmetics();
    }

    /*
     * @After
     * @AfterClass
     * */
    @AfterClass
    public static void runTAfter() {
        a = null;
    }

    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        Assert.assertEquals(10.0, res, 0);
        //if (res == 10) fail();
        //Assert.assertNull(res);
        //Assert.assertTrue("Not equals 10",res == 10);
        //Assert.assertFalse(res == 10);
    }

    @Ignore
    @Test
    public void testDeduct() {
        double res = a.deduct(3, 7);
        Assert.assertEquals(-4.0, res, 0);
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        Assert.assertEquals(21.0, res, 0);
    }

    @Test
    public void testDivide() {
        double res = a.divide(10, 5);
        Assert.assertEquals(2.0, res, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivException() {
        a.divide(10.0, 0.0);
    }

    @Test
    public void testRuleDivException() {
        exp.expect(ArithmeticException.class);
        a.divide(10.0, 0.0);
    }

    @Test(timeout = 1000)
    public void testTime() {
        a.divide(10.0, 10.0);
    }

    @Ignore
    @Test
    public void testRuleTime() {
        while (true) ;
    }
}
