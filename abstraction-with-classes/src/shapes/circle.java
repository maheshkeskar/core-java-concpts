package shapes;


import features.shape;

public class Circle extends shape {

    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    @Override
    public void calculateArea() {

         area = Shape.PI * this.radius * this.radius;
    }
}