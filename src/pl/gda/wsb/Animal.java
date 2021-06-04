package pl.gda.wsb;


public class Animal  implements Saleable {
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

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if(buyer.getCash() >= price){
            if(seller.getPet() == this ){
                buyer.setPet(this);
                seller.setPet(null);
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                System.out.println("Sprzedano zwierza");
            }else {
                throw new Exception("Klient nie ma tego zwierza.");
            }
        }else {
            throw new Exception("Klient nie ma kasy!");
        }
    }
}
