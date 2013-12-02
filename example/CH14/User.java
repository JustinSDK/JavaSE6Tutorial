package onlyfun.caterpillar;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private int number; 

    public User() { 
    } 

    public User(String name, int number) { 
        this.name = name; 
        this.number = number; 
    } 

    public void setName(String name) {
        this.name = name;
    }
    
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() { 
        return name; 
    } 

    public int getNumber() { 
        return number; 
    } 
}