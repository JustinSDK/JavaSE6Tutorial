import java.io.*; 

public class BufferedReaderDemo { 
    public static void main(String[] args) throws IOException { 
        BufferedReader bufferedReader = 
                          new BufferedReader(
                             new InputStreamReader(System.in)); 

        System.out.print("請輸入一列文字，可包括空白: "); 
        String text = bufferedReader.readLine(); 
        System.out.println("您輸入的文字: " + text); 
    } 
}