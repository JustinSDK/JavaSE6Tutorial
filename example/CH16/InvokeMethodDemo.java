package onlyfun.caterpillar;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethodDemo {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            // ㄏノ礚把计篶よ猭ミン
            Object targetObj = c.newInstance();
            // 砞﹚把计篈
            Class[] param1 = {String.class};
            // 沮把计篈よ猭ン
            Method setNameMethod = c.getMethod("setName", param1);
            // 砞﹚ま计 
            Object[] argObjs1 = {"caterpillar"};
            // 倒﹚ま计㊣﹚ンぇよ猭
            setNameMethod.invoke(targetObj, argObjs1);
            
            
            Class[] param2 = {Integer.TYPE};
            Method setScoreMethod = 
                     c.getMethod("setScore", param2);
            
            Object[] argObjs2 = {new Integer(90)};
            setScoreMethod.invoke(targetObj, argObjs2);
            // 陪ボン磞瓃
            System.out.println(targetObj);
            
        } catch (ClassNotFoundException e) {
            System.out.println("тぃ摸");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("⊿Τ硂よ猭");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}