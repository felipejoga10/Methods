package MethodsJava;

public class returningValuefromMethod {
    public static void main(String[] args) {
        sayHello("Jhon");
        sayHello("Wilson");
        sayHello("Jack");
        int sum = Add(100,201,335);
        System.out.println(sum);
        Add(500,300,3);
        Add(85,43,2);

    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name +" your  MTFCKR!! ");

    }

    public static int Add (int a, int b, int c){
        System.out.println(a+b+c);
        return (a + b + c);
    }
}
