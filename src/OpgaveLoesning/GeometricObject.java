package OpgaveLoesning; // SUPERCLASS AND SUBCLASS

import java.util.Date;

//SUPERCLASS - fra listing 11.1, side 433 i IJP
public class GeometricObject {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    //no arg constructor med dato for oprettelse
    public GeometricObject(){
        dateCreated = new java.util.Date();
    }
    //Constructor med specificeret farve, og fyldt/ikke fyldt, med tilhørende dato for oprettelse
    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }


    //Get metoder
    public String getColor(){
        return color;
    }
    public boolean isFilled() {//siden det er et boolean udtryk, hedder det 'isFilled' og obj returneres fyldt med farve.
        return filled;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    //Set metoder
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    //Equals metode
    public boolean equals(Object obj){ //Equals metoden i Object.java klassen
        return (this == obj);
    }


}
