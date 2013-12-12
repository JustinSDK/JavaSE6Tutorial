public class DataRange { 
    public static void main(String[] args) { 
        System.out.printf("short \t數值範圍：%d ~ %d\n", 
                             Short.MAX_VALUE, Short.MIN_VALUE); 
        System.out.printf("int \t數值範圍：%d ~ %d\n", 
                             Integer.MAX_VALUE, Integer.MIN_VALUE); 
        System.out.printf("long \t數值範圍：%d ~ %d\n",
                             Long.MAX_VALUE, Long.MIN_VALUE); 
        System.out.printf("byte \t數值範圍：%d ~ %d\n", 
                             Byte.MAX_VALUE, Byte.MIN_VALUE); 
        System.out.printf("float \t數值範圍：%e ~ %e\n", 
                             Float.MAX_VALUE, Float.MIN_VALUE); 
        System.out.printf("double \t數值範圍：%e ~ %e\n", 
                             Double.MAX_VALUE, Double.MIN_VALUE); 
    } 
}