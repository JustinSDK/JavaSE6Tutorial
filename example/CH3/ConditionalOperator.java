import java.util.Scanner;
 
public class ConditionalOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("請輸入學生分數: "); 
        int scoreOfStudent = scanner.nextInt(); 
        System.out.println("該生是否及格? " + 
                     (scoreOfStudent >= 60 ? '是' : '否'));
    }
}