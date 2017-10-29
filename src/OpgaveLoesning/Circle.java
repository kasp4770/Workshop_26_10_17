package OpgaveLoesning;


//Subclass af GeometricObject.java
public class Circle extends GeometricObject {

    private double radius;

    //no arg constructor
    public Circle(){
    }
    //Constructor med specificeret radius
    public Circle(double radius){
        this.radius = radius;
    }

    //Constructor med specificeret radius, farve og fyldt/ikke fyldt (første effekt fra superklassen Geo(...).java
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    //Get metoder
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getDiameter(){
        return 2 * radius;
    }
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    //Set metoder
    public void setRadius(){
        this.radius = radius;
    }
    public void printCircleInfo(){ //anden effekt fra superklassen (getDateCreated())
        System.out.println("The circle is created " + getDateCreated() + " and the readius is " + radius);
    }
    //Et eksempel på 'overriding' af en af superklassens metoder (... for at gøre den til Circle.java's egen metode.
    @Override //Automatisk input fra intellij. Override
    public String toString() {
        return super.toString() + "\nradius is " + radius;
    }
}
