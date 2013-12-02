public class ToStringDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0; i < 10; i++)
            builder.append(i);

        System.out.println(builder.toString());
    }
}