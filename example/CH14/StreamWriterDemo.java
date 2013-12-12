 package onlyfun.caterpillar;
 
 import java.io.*;
 
 public class StreamWriterDemo {
    public static void main(String[] args) {
        try {
            // 「簡體中文」四個字的 GB2312 編碼
            byte[] sim = {(byte)0xbc, (byte)0xf2, 
                          (byte)0xcc, (byte)0xe5,
                          (byte)0xd6, (byte)0xd0,
                          (byte)0xce, (byte)0xc4};
            // 陣列作為串流來源
            ByteArrayInputStream byteArrayInputStream = 
                            new ByteArrayInputStream(sim);
            InputStreamReader inputStreamReader = 
                new InputStreamReader( 
                  byteArrayInputStream, "GB2312"); 

            // PrintWriter還接受Writer實例作為引數
            PrintWriter printWriter = 
               new PrintWriter(
                 new OutputStreamWriter(
                      new FileOutputStream(args[0]), "GB2312")); 

            int in = 0; 

            printWriter.print("PrintWriter: ");
            // 寫入陣列內容
            while((in = inputStreamReader.read()) != -1)  { 
                printWriter.print((char)in); 
            }
            printWriter.println();

            printWriter.close();
            byteArrayInputStream.reset();

            // PrintStream 接受OutputStream實例作為引數
            PrintStream printStream = 
                new PrintStream(new FileOutputStream(args[0], true), 
                                true, "GB2312");
 
            printStream.print("PrintStream: ");
            // 寫入陣列內容
            while((in = inputStreamReader.read()) != -1)  { 
                printStream.print((char)in); 
            }
            printStream.println();

            inputStreamReader.close();
            printStream.close();
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println("沒有指定檔案");
        } 
        catch(IOException e) { 
            e.printStackTrace(); 
        } 
    }
 }