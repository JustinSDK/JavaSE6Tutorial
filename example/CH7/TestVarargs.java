public class TestVarargs {
    public static void main(String[] args) {
        int sum = 0;
 
        sum = MathTool.sum(1, 2);
        System.out.println("1 + 2 = " + sum);
 
        sum = MathTool.sum(1, 2, 3);
        System.out.println("1 + 2 + 3 = " + sum);
 
        sum = MathTool.sum(1, 2, 3, 4, 5);
        System.out.println("1 + 2 + 3+ 4+ 5 = " + sum);
    }
}
