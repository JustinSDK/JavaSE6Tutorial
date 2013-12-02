public class DetailActionDemo {
    public static void main(String[] args) {
        for(DetailAction action : DetailAction.values()) {
            System.out.printf("%s¡G%s%n", 
                           action, action.getDescription());
        }
    }
}