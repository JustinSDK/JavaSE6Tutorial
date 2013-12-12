package onlyfun.caterpillar;

import java.util.logging.*; 
import java.lang.reflect.*; 

public class LogHandler implements InvocationHandler { 
    private Logger logger = 
               Logger.getLogger(this.getClass().getName()); 
    private Object delegate; 

    // 綁定要代理的物件
    public Object bind(Object delegate) { 
        this.delegate = delegate;
        // 建立並傳回代理物件
        return Proxy.newProxyInstance(
                 delegate.getClass().getClassLoader(),
                 // 要被代理的介面
                 delegate.getClass().getInterfaces(), 
                 this); 
    }

    // 代理要呼叫的方法，並在其前後增加行為
    public Object invoke(Object proxy, 
                         Method method, 
                         Object[] args) throws Throwable {
        Object result = null; 
        try { 
            logger.log(Level.INFO, 
                         "method starts..." + method.getName()); 
            result = method.invoke(delegate, args); 
            logger.log(Level.INFO, 
                         "method ends..." + method.getName()); 
        } catch (Exception e){ 
            logger.log(Level.INFO, e.toString()); 
        } 
        return result; 
    } 
}