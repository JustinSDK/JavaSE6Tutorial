package onlyfun.caterpillar;
 
public class PersonalInfoTest {
    public static void main(String[] args) {
        final PersonalInfo person = new PersonalInfo(); 

        // 假設會有兩個執行緒可能更新person物件
        Thread thread1 = new Thread(new Runnable() { 
           public void run() { 
              while(true) 
                  person.setNameAndID("Justin Lin", "J.L"); 
           } 
        }); 
         
        Thread thread2 = new Thread(new Runnable() { 
            public void run() { 
               while(true) 
                   person.setNameAndID("Shang Hwang", "S.H");    
            } 
        }); 
         
        System.out.println("開始測試....."); 
        
        thread1.start(); 
        thread2.start();
    }
}