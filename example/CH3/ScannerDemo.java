import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入您的名字：");
        System.out.printf("哈囉！ %s!\n", scanner.next());
    }
}