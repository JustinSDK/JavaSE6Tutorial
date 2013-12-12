import java.util.Scanner;

public class AverageInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("請輸入學生人數: "); 
 
        int length = scanner.nextInt();
        float[] score = new float[length];  // 動態配置長度 
 
        for(int i = 0; i < score.length; i++) {
            System.out.print("輸入分數：");
            float input = scanner.nextFloat();
            score[i] = input;
        }

        System.out.print("\n分數：");
        float total = 0;
        for(int i = 0; i < score.length; i++) {
            total = total + score[i];
            System.out.print(score[i] + " ");
        }

        System.out.printf("\n平均：%.2f", total / score.length);
    }
}