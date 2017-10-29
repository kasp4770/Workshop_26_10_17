package OpgaveLoesning;

public class Polymorfi {
    public static void main(String[] args) {
        //Polymorfi betyder at en variabel fra en supertype kan referere til et subtype objekt.
        // (poly = flere, morfism = former)

        //Every instance of a subclass is also an instance of its superclass, but not vice versa..

        //nyt objekt oprettet i en metode. Objektet er fra en subklasse og arver egenskaber fra dens superklasse
        displayObject(new Circle(1, "red", false));
    }

    public static void displayObject(GeometricObject object){ //en metode som viser objektets data
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
