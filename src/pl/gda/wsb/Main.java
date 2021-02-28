package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!!");

        Animal animal1 = new Animal("mouse", "Jerry", 0.8);
        Animal animal2 = new Animal("cat", "Tom", 4.5);
        System.out.println(animal1);
        System.out.println(animal1.name);


        if(animal1.weight>animal2.weight){
            System.out.println("Najcieższym zwierzęciem jest: "+animal1.name);
        }else{
            System.out.println("Najcieższym zwierzęciem jest: "+animal2.name);
        }



        Human human1 = new Human("Wojtek", "Siedlecki",24);
        Human human2 = new Human("Darek", "Adacki",15);
        System.out.println(human1.age);

        if(human1.age> human2.age){
            System.out.println("Starszy jest: "+human1.name);
        }else{
            System.out.println("Starszy jest: "+human2.name);
        }

        Phone phone1 = new Phone("A10", "Samsung", 123654789);
        Phone phone2 = new Phone("Note 8T", "Redmi", 987654321);
        System.out.println(phone1.number);
    }
}


