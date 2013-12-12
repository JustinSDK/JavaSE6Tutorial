public class HollowCircle extends AbstractCircle {
    public HollowCircle() {}

    public HollowCircle(double radius) {
        this.radius = radius;
    }

    public void render() {
        System.out.printf("畫一個半徑 %f 的空心圓\n", getRadius());
    }
}