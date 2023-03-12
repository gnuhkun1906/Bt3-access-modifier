package BT1;

public class Circle {
     double radius=1.0;
    private String color="red";

     Circle() {
    }

     Circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
}
