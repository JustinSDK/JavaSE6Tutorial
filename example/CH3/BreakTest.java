public class BreakTest { 
    public static void main(String[] args) { 
        back : { 
            for(int i = 0; i < 10; i++) { 
                if(i == 9) { 
                    System.out.println("break"); 
                    break back; 
                } 
            } 
            System.out.println("test"); 
        } 
    } 
}