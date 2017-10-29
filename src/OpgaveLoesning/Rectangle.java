package OpgaveLoesning;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    //No arg constructor
    public Rectangle() {
    }
    //constructor med specificeret bredde og højde
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    //constructor med specificeret bredde, højde, farve og fyldt/ikke fyldt
    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    //Get metoder
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

    //Set metoder
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }


    public double getArea() {
        return width * height;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }
}