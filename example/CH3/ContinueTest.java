public class ContinueTest { 
    public static void main(String[] args) { 
        back1: 
        for(int i = 0; i < 10; i++){ 
            back2: 
            for(int j = 0; j < 10; j++) { 
                if(j == 9) { 
                    continue back1; 
                } 
            }
            System.out.println("test"); 
        } 
    } 
}
  