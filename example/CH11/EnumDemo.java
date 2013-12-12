public class EnumDemo {
    public static void main(String[] args) {
        doAction(Action.TURN_RIGHT);
    }
 
    public static void doAction(Action action) {
        switch(action) { 
            case TURN_LEFT: 
                System.out.println("向左轉"); 
                break; 
            case TURN_RIGHT: 
                System.out.println("向右轉"); 
                break; 
            case SHOOT: 
                System.out.println("射擊"); 
                break; 
        } 
    }
}