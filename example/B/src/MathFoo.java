package onlyfun.caterpillar;

public class MathFoo {
    private static int num1;
    private static int num2;

    public static void setNum1(int n) {
        num1 = n;
    }

    public static void setNum2(int n) {
        num2 = n;
    }

    public static int gcd() {
        int r = 0;
        while(num2 != 0) { 
            r = num1 % num2; 
            num1 = num2; 
            num2 = r; 
        } 
        return num1;
    }
}