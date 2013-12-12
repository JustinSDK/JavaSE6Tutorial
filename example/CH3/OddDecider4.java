import java.util.Scanner;
 
public class OddDecider4 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int replay = 0; 
 
        do { 
            System.out.print("輸入整數值："); 
            input = scanner.nextInt();
            System.out.println("輸入數為奇數？" + 
                            ((input%2 == 1) ? 'Y': 'N')); 
            System.out.print("繼續(1:繼續 0:結束)？"); 
            replay = scanner.nextInt();
        } while(replay == 1);   
    } 
}