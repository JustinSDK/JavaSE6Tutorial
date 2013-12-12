package onlyfun.caterpillar;
 
public class Student {
    private String name; // 固定 15 字元
    private int score; 
 
    public Student() { 
        setName("noname"); 
    } 
 
    public Student(String name, int score) {
        setName(name);
        this.score = score; 
    } 
 
    public void setName(String name) {
        StringBuilder builder = null;
        if(name != null) 
            builder = new StringBuilder(name); 
        else 
            builder = new StringBuilder(15); 
 
        builder.setLength(15); 
        this.name = builder.toString();
    }
    
    public void setScore(int score) {
        this.score = score;
    }
 
    public String getName() { 
        return name; 
    } 
 
    public int getScore() { 
        return score; 
    } 
     // 每筆資料固定寫入34位元組 
    public static int size() { 
        return 34; 
    } 
}