package test.onlyfun.caterpillar;

import onlyfun.caterpillar.MathTool;

public class MathToolTest {
    public static void main(String[] args) {
        if(MathTool.gcd(10, 5) == 5) {
            System.out.println("GCD Test OK!");
        }
        else {
            System.out.println("GCD Test Fail!");
        }
    }
}