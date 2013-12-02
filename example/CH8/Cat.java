import java.util.Date;

public class Cat {
    private String name;
    private Date birthday;

    public Cat() {
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setBirthday(Date birthday) { this.birthday = birthday; }
    public Date getBirthday() { return birthday; }

    public boolean equals(Object other) { 
        if (this == other) 
            return true; 

        if (!(other instanceof Cat)) 
            return false; 

        final Cat cat = (Cat) other; 

        if (!getName().equals(cat.getName())) 
            return false; 

        if (!getBirthday().equals(cat.getBirthday())) 
            return false; 

        return true; 
    } 

    public int hashCode() { 
        int result = getName().hashCode(); 
        result = 29 * result + getBirthday().hashCode(); 
        return result; 
    } 
}