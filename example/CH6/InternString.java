public class InternString { 
    public static void main(String[] args) { 
        String str1 = "fly"; 
        String str2 = "weight"; 
        String str3 = "flyweight"; 
        String str4 = null; 

        str4 = str1 + str2;
        System.out.println(str3 == str4); 

        str4 = (str1 + str2).intern(); 
        System.out.println(str3 == str4); 
    } 
}
 