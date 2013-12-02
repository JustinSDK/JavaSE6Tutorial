package test.onlyfun.caterpillar;

import onlyfun.caterpillar.MathTool;
import junit.framework.TestCase;

public class MathToolUnitTest extends TestCase {
    public void testGcd() {
        assertEquals(5, MathTool.gcd(10, 5));
    }
    
    public static void main(String[] args) {
        junit.textui.TestRunner.run(MathToolUnitTest.class);
    }
}