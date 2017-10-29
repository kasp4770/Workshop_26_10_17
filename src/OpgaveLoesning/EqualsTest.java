package OpgaveLoesning;

public class EqualsTest {
    public static void main(String[] args) {
        Object circle1 = new Circle(10);
        Object circle2 = new Circle(10);

        System.out.println(circle1.equals(circle2));
        /*Resultatet er 'false' idet at navnet på objekterne ikke er det samme. Hvis jeg skulle sammenligne to cirkler
        ville man bruge radius. Derfor kræves det at man 'override'er metoden (og placerer den i Circle.java) fra
        Object.java til:
        public boolean equals(Object circle)
        {return this.radius == circle.radius}
         */

    }
}
