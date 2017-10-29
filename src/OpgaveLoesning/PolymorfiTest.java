package OpgaveLoesning;

import java.util.ArrayList;

public class PolymorfiTest {
    public static void main(String[] args) {
        //Polymorfi betyder at en variabel fra en supertype kan referere til et subtype objekt.
        // (poly = flere, morfism = former)

        //Every instance of a subclass is also an instance of its superclass, but not vice versa..

        //nyt objekt oprettet i en metode. Objektet er fra en subklasse og arver egenskaber fra dens superklasse
        displayObject(new Circle(1, "red", false));

        //Eksempel på ArrayList og brugen af denne.
        ArrayList<GeometricObject> geoObj = new ArrayList<>();

        geoObj.add(new Circle (10));
        geoObj.add(new Circle(25));
        geoObj.add(new Rectangle(2,5));

        /*Udprint areal ved brug af getArea() fra superklassen GeometricObject.java. Metoden er 'Abstract', dvs.
        compileren selv henter getArea() fra hhv. Circle.java og Rectangle.java da de indeholder en
        overskrevet(overridden) udgave af getArea()*/
        System.out.println("Arealet af cirkel 1 er " + geoObj.get(0).getArea()); //GeometricObject.getArea --> Circle --> Circle.getArea
        System.out.println("Arealet af cirkel 2 er " + geoObj.get(1).getArea());
        System.out.println("Arealet af rektankel 1 er " + geoObj.get(2).getArea()); //GeometricObject.getArea --> Rectangle --> Rectangle.getArea
    }

    public static void displayObject(GeometricObject object){ //en metode som viser objektets data
        System.out.println("Created on " + object.getDateCreated() + ". Color is " + object.getColor());
    }
}
