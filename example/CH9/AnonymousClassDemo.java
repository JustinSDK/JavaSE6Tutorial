public class AnonymousClassDemo { 
    public static void main(String[] args) { 
        Object obj = 
            new Object() { 
                public String toString() { // 重新定義toString()
                    return "匿名類別物件"; 
                } 
            }; 

        System.out.println(obj); 
    } 
}