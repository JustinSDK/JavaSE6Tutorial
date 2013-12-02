import java.util.Scanner;
 
public class OddDecider3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("叫块计: "); 
        int input = scanner.nextInt();
        int remain = input % 2; // ―埃 2 緇计
 
        if(remain == 1) // 狦緇计1
            System.out.println(input + "计"); 
        else 
            System.out.println(input + "案计"); 
    }
}