import static java.lang.System.out;
import static java.util.Arrays.sort;
import static onlyfun.caterpillar.Arrays.sort;

public class ImportStaticDemo2 {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 1, 7, 6, 8};

        sort(array);

        for(int i : array) {
            out.print(i + " ");
        }
    }
}