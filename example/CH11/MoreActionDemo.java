public class MoreActionDemo {
    public static void main(String[] args) {
        for(MoreAction action : MoreAction.values()) {
            System.out.printf("%s¡G%s%n", 
                           action, action.getDescription());
        }
    }
}