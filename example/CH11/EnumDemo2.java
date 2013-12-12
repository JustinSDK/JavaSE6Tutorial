public class EnumDemo2 {
    private enum InnerAction {TURN_LEFT, TURN_RIGHT, SHOOT};

    public static void main(String[] args) {
        doAction(InnerAction.TURN_RIGHT);
    }
 
    public static void doAction(InnerAction action) {
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