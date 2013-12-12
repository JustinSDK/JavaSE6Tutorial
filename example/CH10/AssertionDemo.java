public class AssertionDemo {
    public static void main(String[] args) {
        if(args.length > 0) {
            System.out.println(args[0]);
        }
        else {
            assert args.length == 0;
            System.out.println("沒有輸入引數");
        }
    }
}