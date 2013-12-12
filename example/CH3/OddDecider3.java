import java.util.Scanner;
 
public class OddDecider3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("請輸入數字: "); 
        int input = scanner.nextInt();
        int remain = input % 2; // 求除 2 的餘數
 
        if(remain == 1) // 如果餘數為1
            System.out.println(input + "為奇數"); 
        else 
            System.out.println(input + "為偶數"); 
    }
}