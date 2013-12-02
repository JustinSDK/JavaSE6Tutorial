package onlyfun.caterpillar;
 
import java.io.*;
 
public class StreamTest { 
    public static void main(String[] args) 
                            throws IOException { 
        FileOutputStream file = 
            new FileOutputStream(
                 new File("test.txt")); 
        file.write(1); 
        file.close(); 
    } 
} 