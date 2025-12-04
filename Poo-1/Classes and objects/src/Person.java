public class Person { //A class starts here

    //These are attributes of this class ,I'll provide more information about it when we talk about attributes and methods
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) { //Constructor
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //This is a method, and I'll also talk about it later
    public  void showInformation(){

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
    }


} // And ends here
