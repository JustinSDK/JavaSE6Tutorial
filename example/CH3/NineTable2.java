public class NineTable2 { 
    public static void main(String[] args) {
        for (int i = 2, j = 1; 
             j < 10; 
             i = (i==9)?((++j/j)+1):(i+1)) { 
            System.out.printf("%d*%d=%2d%c", i, j,  i * j,
                                 (i==9 ? '\n' : ' '));
        }   
    }
} 