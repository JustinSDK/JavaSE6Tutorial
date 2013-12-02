package onlyfun.caterpillar;
 
import java.io.*;
 
public class PrintStreamDemo {
    public static void main(String[] args) 
                           throws FileNotFoundException {
        PrintStream printStream = new PrintStream( 
                new FileOutputStream(
                        new File("test.txt")));

        printStream.println(1);
 
        printStream.close();
    }
}