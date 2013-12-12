public class ConcreteCircle extends AbstractCircle {
    public ConcreteCircle() {}

    public ConcreteCircle(double radius) {
        this.radius = radius;
    }

    public void render() {
        System.out.printf("畫一個半徑 %f 的實心圓\n", getRadius());
    }
}