public class XorCode { 
    public static void main(String[] args) { 
        char ch = 'A'; 
        System.out.println("½s½X«e¡G" + ch); 

        ch = (char)(ch^7); 
        System.out.println("½s½X«á¡G" + ch); 

        ch = (char)(ch^7); 
        System.out.println("¸Ñ½X¡G" + ch); 
    } 
} 
