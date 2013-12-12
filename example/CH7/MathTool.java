public class MathTool {
    public static int sum(int... nums) { // 使用...宣告參數
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }
}