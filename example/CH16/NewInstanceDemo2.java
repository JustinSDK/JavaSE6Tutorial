package onlyfun.caterpillar;
 
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
 
public class NewInstanceDemo2 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName(args[0]);
            
            // ﹚把计篈
            Class[] params = new Class[2];
            // 材把计琌String
            params[0] = String.class;
            // 材把计琌int
            params[1] = Integer.TYPE;

            // 眔癸莱把计篶よ猭            
            Constructor constructor = 
                             c.getConstructor(params);
            
            // ﹚ま计ず甧
            Object[] argObjs = new Object[2];
            argObjs[0] = "caterpillar";
            argObjs[1] = new Integer(90);
            
            // 倒﹚ま计龟ㄒて
            Object obj = constructor.newInstance(argObjs);
            // ㊣toString()ㄓ芠磞瓃
            System.out.println(obj);
 
        } catch (ClassNotFoundException e) {
            System.out.println("тぃ摸");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println("⊿Τ┮﹚よ猭");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}