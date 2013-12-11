import java.util.Scanner;
 
public class ScoreLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("輸入分數："); 
        int score = scanner.nextInt();
 
        if(score >= 90) 
            System.out.println("得A"); 
        else if(score >= 80 && score < 90) 
            System.out.println("得B"); 
        else if(score >= 70 && score < 80) 
            System.out.println("得C"); 
        else if(score >= 60 && score < 70) 
            System.out.println("得D"); 
        else 
            System.out.println("得E(不及格)"); 
    }
}