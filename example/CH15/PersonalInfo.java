package onlyfun.caterpillar;
 
public class PersonalInfo {
    private String name; 
    private String id; 
    private int count; 
     
    public PersonalInfo() { 
       name = "nobody"; 
       id = "N/A"; 
    } 
     
    public void setNameAndID(String name, String id) { 
       this.name = name; 
       this.id = id; 
       if(!checkNameAndIDEqual()) {
           System.out.println(count + 
                   ") illegal name or ID.....");
       } 
       count++; 
    } 
     
    private boolean checkNameAndIDEqual() { 
       return (name.charAt(0) == id.charAt(0)) ? 
                             true : false; 
    } 
}