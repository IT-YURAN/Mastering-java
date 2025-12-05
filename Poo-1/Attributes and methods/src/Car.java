public class Car {

    //Attributes
    String maker;
    String model;
    int year;


    public Car(String maker, String model, int year) {
        this.maker = maker;
        this.model = model;
        this.year = year;
    }

    public void printinfo(){

        System.out.println("Maker:"+maker);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }

    public void makerInUpercase(String maker){
        System.out.println(maker.toUpperCase());
    }
}
