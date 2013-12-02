public class LogicalOperator {
    public static void main(String[] args) {
        int number = 75;
        System.out.println((number > 70 && number < 80)); 
        System.out.println((number > 80 || number < 75)); 
        System.out.println(!(number > 80 || number < 75)); 
    }
}