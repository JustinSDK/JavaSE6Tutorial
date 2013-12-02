package onlyfun.caterpillar;

import java.util.Comparator;

public class CustomComparator<T> implements Comparator<T> {
    public int compare(T o1, T o2) {
        if (((T) o1).equals(o2)) 
            return 0;
        return ((Comparable<T>) o1).compareTo((T) o2) * -1;
    }
}