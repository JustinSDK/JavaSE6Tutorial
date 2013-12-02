public abstract class AbstractCircle {
    protected double radius;

    public void setRedius(int radius) { this.radius = radius; }
    public double getRadius() { return radius; }

    public abstract void render();
}