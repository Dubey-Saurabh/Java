package JavaCollections.InheritanceConcept.Area;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {

        this.length = length;
        this.width = width;

    }

    public double getArea() {
        return length * width;
    }

}
