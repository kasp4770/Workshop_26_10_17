package OpgaveLoesning;

//Tænk almindelig casting
//f.eks. tal = 3.5 --> (int)tal, for at tvinge compileren til at give en int i stedet for en double

public class Casting {
    public static void main(String[] args) {
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1,1);

        displayObject(object1);
        displayObject(object2);
    }
    //Polymorfi og casting metode
    public static void displayObject(Object object){ //en metode som viser objektets data (polymorfi)
        if(object instanceof Circle){
            System.out.println("The circle area is "+ ((Circle)object).getArea()); //Explicit Casting
            System.out.println("The circle diameter is: " + ((Circle)object).getDiameter());
        }
        else if(object instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle) object).getArea()); //Explicit Casting
        }
    }
}
