public class CheckArgsDemo {
    public static void main(String[] args) {
        try {
            System.out.printf("執行 %s 功能%n", args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定引數");
            e.printStackTrace();
        }
    }
}