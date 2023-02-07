package shapes;

import features.shape;

public class Rectangle extends shape {

    float length, breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        area = this.length * this.breadth;
    }
}
