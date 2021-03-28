package pl.gda.wsb;

public class Animal {
    final String species;
    String name;
    double weight;

    public static  final  double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static  final  double DEFAULT_CAT_WEIGHT = 5.0;
    public Animal(String species, String name, double weight) {
        this.species = species;
        this.name = name;
        //zmiana warunku
        this.weight = weight;

        if(species.equals("mouse")){
            this.weight = DEFAULT_MOUSE_WEIGHT;
        }else  if(species.equals("cat")){
            this.weight = DEFAULT_CAT_WEIGHT;
        }else{
            this.weight = 0.5;
        }
    }

    void  feed(){
        if(this.weight > 0){
            this.weight ++;
            System.out.println("Zwierze zwiekszyło mase");
        }else{
            System.out.println("Zwierze nie żyje");
        }
    };
    void  takeForAWALK(){
        if(this.weight > 0){
            this.weight --;
            System.out.println("Zwierze zmniejszyło mase");
        }else{
            System.out.println("Zwierze nie żyje");
        }
    };
}
