package MethodsJava;

public class ClassConstructor {

    public static void main(String[] args) {
        Cube cube1 = new Cube();
        System.out.println(cube1.getCubeVolume() + " m3.");

        Cube cube2 = new Cube(20,20,20);

        System.out.println(cube2.getCubeVolume() + " m3.");
    }



}
