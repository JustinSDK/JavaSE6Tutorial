public class RegularExpressionDemo {
    public static void main(String[] args) {
        String text = "abcdebcadxbc";

        String[] tokens = text.split(".bc");
        for(String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();

        tokens = text.split("..cd");
        for(String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();

    }
}