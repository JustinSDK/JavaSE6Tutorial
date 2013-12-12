package onlyfun.caterpillar;

import java.util.*;

public class ThreadLocal<T> {
    // 取得一個同步化的Map物件
    private Map<Thread, T> storage = 
             Collections.synchronizedMap(new HashMap<Thread, T>());

    public T get() {
        // 取得目前執行get()方法的執行緒
        Thread current = Thread.currentThread();
        // 根據執行緒取得執行緒自有的資源
        T t = storage.get(current);

        // 如果還沒有執行緒專用的資源空間
        // 則建立一個新的空間
        if(t == null && 
           !storage.containsKey(current)) {
            t = initialValue();
            storage.put(current, t);
        }

        return t;
    }

    public void set(T t) {
        storage.put(Thread.currentThread(), t);
    }

    public T initialValue() {
        return null;
    }
}