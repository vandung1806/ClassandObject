public class Cricle {
    private double radius;
    private String color;

    public Cricle() {
        radius = 1.0;
        color = "red";
    }

    public Cricle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Cricle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public String toString() {
        return "Radius: " + this.radius + " - Color: " + this.color;
    }
}
