package onlyfun.caterpillar;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

public class CommandUtil {
    // 給定Map物件及要產生的Bean類別名稱
    // 可以取回已經設定完成的物件
    public static Object getCommand(Map requestMap, 
                                    String commandClass) 
                                      throws Exception {
        Class c = Class.forName(commandClass);
        Object o = c.newInstance();
    
        return updateCommand(requestMap, o);
    }

    // 使用reflection自動找出要更新的屬性
    public static Object updateCommand(
                           Map requestMap, 
                           Object command) 
                              throws Exception {
        Method[] methods = 
                   command.getClass().getDeclaredMethods();
    
        for(int i = 0; i < methods.length; i++) {
            // 略過private、protected成員
            // 且找出必須是set開頭的方法名稱
            if(!Modifier.isPrivate(methods[i].getModifiers()) &&
               !Modifier.isProtected(methods[i].getModifiers()) &&  
               methods[i].getName().startsWith("set")) {
                // 取得不包括set的名稱
                String name = methods[i].getName()
                                        .substring(3)
                                        .toLowerCase();
                // 如果setter名稱與鍵值相同
                // 呼叫對應的setter並設定值
                if(requestMap.containsKey(name)) {
                    String param = (String) requestMap.get(name);
                    Object[] values = findOutParamValues(
                                        param, methods[i]);
                    methods[i].invoke(command, values);
                }
            }
        }
        return command;  
    }
  
    // 轉換為對應型態的值
    private static Object[] findOutParamValues(
                     String param, Method method) {
        Class[] params = method.getParameterTypes();
        Object[] objs = new Object[params.length];
    
        for(int i = 0; i < params.length; i++) {
            if(params[i] == String.class) {
                objs[i] = param;
            }
            else if(params[i] == Short.TYPE) {
                short number = Short.parseShort(param);
                objs[i] = new Short(number);
            }
            else if(params[i] == Integer.TYPE) {
                int number = Integer.parseInt(param);
                objs[i] = new Integer(number);
            }
            else if(params[i] == Long.TYPE) {
                long number = Long.parseLong(param);
                objs[i] = new Long(number);
            }
            else if(params[i] == Float.TYPE) {
                float number = Float.parseFloat(param);
                objs[i] = new Float(number);
            }
            else if(params[i] == Double.TYPE) {
                double number = Double.parseDouble(param);
                objs[i] = new Double(number);
            }
            else if(params[i] == Boolean.TYPE) {
                boolean bool = Boolean.parseBoolean(param);
                objs[i] = new Boolean(bool);
            }
        }    
        return objs;
    }
}