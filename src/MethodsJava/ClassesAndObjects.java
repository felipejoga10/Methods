package MethodsJava;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student Mark = new Student(); //Mark -> object or instance

        Mark.age = 16;
        Mark.id = 451;
        Mark.name = "Mark MTRFCK";

        Student Tom = new Student(); //Mark -> object or instance

        Tom.age = 14;
        Tom.id = 450;
        Tom.name = "Tom MTRSCK";

        System.out.println(Mark.name + " is "+ Mark.age + " years old.");
        System.out.println(Tom.name + " is "+ Tom.age + " years old.");


    }
}
