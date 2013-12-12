public class CatchWho2 { 
    public static void main(String[] args) { 
        try {
            try { 
                throw new ArrayIndexOutOfBoundsException(); 
            } 
            catch(ArithmeticException e) { 
                System.out.println(
                    "ArrayIndexOutOfBoundsException" + 
                    "/內層try-catch"); 
            }
 
            throw new ArithmeticException(); 
        } 
        catch(ArithmeticException e) { 
            System.out.println("發生ArithmeticException"); 
        } 
        catch(ArrayIndexOutOfBoundsException e) { 
            System.out.println(
                "ArrayIndexOutOfBoundsException" + 
                "/外層try-catch"); 
        } 
    } 
}