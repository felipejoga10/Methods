package MethodsJava;

public class Inheritance {
    /* Classes in Java can be extended
    creating new classes which retain
    characteristics of the case class
     */
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();

        rec.set_values(10,10);
        tri.set_values(10,10);

        System.out.println("Area of rectangle =  " + rec.area() + "m²");
        System.out.println("Area of triangle =  " + tri.area() + "m²");

    }
}
