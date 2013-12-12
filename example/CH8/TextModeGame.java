import java.util.Scanner;
 
public class TextModeGame extends AbstractGuessGame {
    private Scanner scanner;
 
    public TextModeGame() {
        scanner = new Scanner(System.in);
    }
 
    protected void showMessage(String message) {
        for(int i = 0; i < message.length()*2; i++) {
            System.out.print("*");
        }
        System.out.println("\n"+ message);
        for(int i = 0; i < message.length()*2; i++) {
            System.out.print("*");
        }
    }
  
    protected int getUserInput() {
        System.out.print("\n輸入數字：");
        return scanner.nextInt();
    }
}