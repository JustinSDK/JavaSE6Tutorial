import java.util.Scanner;
 
public class OddDecider {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入數字: "); 
        int number = scanner.nextInt(); 
        System.out.println("是否為奇數? " + 
                      (number%2 != 0 ? '是' : '否')); 
    }
}