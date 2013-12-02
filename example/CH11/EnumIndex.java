public class EnumIndex {
    public static void main(String[] args) {
        for(Action action : Action.values()) {
            System.out.printf("%d %s%n", action.ordinal(), action);
        }
    }
}