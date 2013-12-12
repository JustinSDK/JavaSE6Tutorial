public class ThrowDemo { 
    public static void main(String[] args) { 
        try {
            double data = 100 / 0.0;
            System.out.println("浮點數除以零：" + data); 
            if(String.valueOf(data).equals("Infinity")) 
                throw new ArithmeticException("除零例外");
        } 
        catch(ArithmeticException e) { 
            System.out.println(e); 
        } 
    } 
}
 