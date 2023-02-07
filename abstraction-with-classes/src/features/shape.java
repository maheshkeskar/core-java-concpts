package features;

public abstract class shape {


    public abstract void calculateArea();

    /**
     * This class {@code Shape} is an abstract class to demonstrate partial abstraction
     * and features of abstract class.
     *
     * @author Vikram Gupta
     */
    public abstract static class Shape {

        public static final float PI = 3.142f;
        public float area;

        public Shape() {
        }

        public Shape(float v, float v1) {
        }

        public Shape(float v) {
        }

        public void displayArea() {
            System.out.println("Area of " + this.getClass().getName() + " is " + area);
        }

        public abstract void calculateArea();
    }

}
