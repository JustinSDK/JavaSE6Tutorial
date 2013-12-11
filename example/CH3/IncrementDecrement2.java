public class IncrementDecrement2 {
    public static void main(String[] args) {
        int i = 0; 
        int number = 0; 

        number = ++i;   // 相當於i = i + 1; number = i; 
        System.out.println(number); 
        number = --i;    // 相當於i = i - 1; number = i; 
        System.out.println(number); 
    }
}