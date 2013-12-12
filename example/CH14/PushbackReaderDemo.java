package onlyfun.caterpillar;
 
import java.io.*;
 
public class PushbackReaderDemo {
    public static void main(String[] args) {
        char[] symbols = {'＜', '＞', 
                          '≦', '≧',
                          '≠', '＝'}; 
        
        try { 
            PushbackReader pushbackReader = 
                  new PushbackReader(
                          new FileReader(args[0])); 

            FileWriter fileWriter = 
                  new FileWriter("math_"+ args[0]); 
              
            int c = 0;
              
            while((c = pushbackReader.read()) != -1) { 
                int poss = -1; 

                switch(c) { 
                    case '<': 
                        poss = 0; break; 
                    case '>': 
                        poss = 1; break; 
                    case '!': 
                        poss = 2; break; 
                    case '=': 
                        poss = 5; break; 
                    default: 
                        fileWriter.write(c); 
                  } 

                  if(poss != -1) {
                      if((c = pushbackReader.read()) == '=') { 
                          fileWriter.write(symbols[poss + 2]); 
                          fileWriter.write(' '); 
                      } 
                      else { 
                          pushbackReader.unread(c); 
                          fileWriter.write(symbols[poss]); 
                      } 
                  } 
              } 
 
              pushbackReader.close(); 
              fileWriter.close(); 
          } 
          catch(ArrayIndexOutOfBoundsException e) { 
              System.out.println("請指定檔案");
          } 
          catch(IOException e) { 
              e.printStackTrace(); 
          } 
    }
}