import java.util.regex.*;

public class RegularExpressionDemo2 {
    public static void main(String[] args) {
        String text = "abcdebcadxbc";

        Pattern pattern = Pattern.compile(".bc");
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println();
    }
}