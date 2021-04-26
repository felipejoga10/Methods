package MethodsJava;

public class StaticKeyword {
    //What does the 'static' keyword do in a class?
    public static void main(String[] args) {
        //static members belong to the class instead of a specific instance.
        Hello hello = new Hello();
        hello.age =10;
        //Hello.DoSomething("Hi people!");
        //hello.DoSomethingElse("Hello everyone.");
        System.out.println(hello.age);

        Hello hello1 = new Hello();
        hello1.age =17;

        System.out.println(hello1.age);
    }
}
