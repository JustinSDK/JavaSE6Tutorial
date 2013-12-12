public class ShiftOperator { 
    public static void main(String[] args) { 
        int number = 1; 

        System.out.println( "2的0次: " + number); 

        number = number << 1; 
        System.out.println("2的1次: " +  number); 

        number = number << 1; 
        System.out.println("2的2次: " + number); 

        number = number << 1; 
        System.out.println("2的3次：" + number); 
    } 
} 