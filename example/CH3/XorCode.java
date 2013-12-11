public class XorCode { 
    public static void main(String[] args) { 
        char ch = 'A'; 
        System.out.println("編碼前：" + ch); 

        ch = (char)(ch^7); 
        System.out.println("編碼後：" + ch); 

        ch = (char)(ch^7); 
        System.out.println("解碼：" + ch); 
    } 
} 
