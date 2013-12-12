package onlyfun.caterpillar;
 
import java.util.*;
 
enum Action {TURN_LEFT, TURN_RIGHT, SHOOT}
 
public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Action, String> map = 
          new EnumMap<Action, String>(Action.class);
        
        map.put(Action.TURN_LEFT, "向左轉");
        map.put(Action.TURN_RIGHT, "向右轉");
        map.put(Action.SHOOT, "射擊");
        
        for(Action action : Action.values( ) ) {
            System.out.println(map.get(action));
        }
    }
}