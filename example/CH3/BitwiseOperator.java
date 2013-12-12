public class BitwiseOperator { 
    public static void main(String[] args) { 
        System.out.println("AND運算："); 
        System.out.println("0 AND 0\t\t" + (0 & 0)); 
        System.out.println("0 AND 1\t\t" + (0 & 1)); 
        System.out.println("1 AND 0\t\t" + (1 & 0)); 
        System.out.println("1 AND 1\t\t" + (1 & 1)); 

        System.out.println("\nOR運算："); 
        System.out.println("0 OR 0\t\t" + (0 | 0)); 
        System.out.println("0 OR 1\t\t" + (0 | 1)); 
        System.out.println("1 OR 0\t\t" + (1 | 0)); 
        System.out.println("1 OR 1\t\t" + (1 | 1)); 

        System.out.println("\nXOR運算："); 
        System.out.println("0 XOR 0\t\t" + (0 ^ 0)); 
        System.out.println("0 XOR 1\t\t" + (0 ^ 1)); 
        System.out.println("1 XOR 0\t\t" + (1 ^ 0)); 
        System.out.println("1 XOR 1\t\t" + (1 ^ 1)); 
    } 
} 