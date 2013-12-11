import java.util.Scanner;
 
public class OddDecider2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入數字: "); 
        int number = scanner.nextInt(); 
        System.out.println("是否為奇數? " + 
                  ((number&1) != 0 ? '是' : '否')); 
    }
}