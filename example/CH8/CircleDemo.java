public class CircleDemo {
    public static void main(String[] args) {
        renderCircle(new ConcreteCircle(3.33));
        renderCircle(new HollowCircle(10.2));
    }

    public static void renderCircle(AbstractCircle circle) {
        circle.render();
    }
}