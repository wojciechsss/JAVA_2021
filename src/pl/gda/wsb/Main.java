package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!!");

        Animal animal1 = new Animal("mouse", "Jerry", 0.8);
        System.out.println(animal1);
        System.out.println(animal1.name);


        Human human1 = new Human("Wojtek", "Siedlecki",24);
        System.out.println(human1.age);

        Phone phone1 = new Phone("A10", "Samsung", 123654789);
        System.out.println(phone1.number);
    }
}


