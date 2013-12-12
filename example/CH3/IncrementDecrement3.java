public class IncrementDecrement3 {
    public static void main(String[] args) {
        int i = 0; 
        int number = 0; 

        number = i++;    // 相當於number = i; i = i + 1; 
        System.out.println(number); 
        number = i--;     // 相當於 number = i; i = i - 1; 
        System.out.println(number); 
    }
}