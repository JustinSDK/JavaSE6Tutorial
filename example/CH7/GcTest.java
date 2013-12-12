public class GcTest { 
    private String name; 
 
    public GcTest(String name) { 
        this.name = name; 
        System.out.println(name + "建立"); 
    } 
 
    // 物件回收前執行 
    protected void finalize() { 
        System.out.println(name + "被回收"); 
    } 
}