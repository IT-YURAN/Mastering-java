public class Person {

   public String name; //can be accessed from anywhere
   int age; //It's default
   private String address; //only can be accessed by a getter method
   protected String company; //Accessible because it is in the same package

    public Person(String name, int age, String address, String company) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.company = company;
    }
}
