package onlyfun.caterpillar;

public class MathTool {
    public static int gcd(int num1, int num2) { 
        int r = 0; 
        while(num2 != 0) { 
            r = num1 % num2; 
            num1 = num2; 
            num2 = r; 
        } 
        return num1; 
    }
}