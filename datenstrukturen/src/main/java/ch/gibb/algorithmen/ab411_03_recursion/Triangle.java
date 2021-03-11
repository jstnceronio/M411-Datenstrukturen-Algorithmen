package ch.gibb.algorithmen.ab411_03_recursion;

public class Triangle {

    private int width;

    public Triangle(int width) {
        this.width = width;
    }

    public int getArea() {
        if (width == 1) { return 1; }
        Triangle smallerTriangle = new Triangle(width - 1);
        int smallerArea = smallerTriangle.getArea();
        return smallerArea + width;
    }
}
