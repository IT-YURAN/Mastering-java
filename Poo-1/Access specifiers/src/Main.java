public class Main {

    public static void main(String[] args) {

        var person=new Person("Alson",24,"Av.25 September","2M");

        System.out.println(person.name);
        System.out.println(person.age);
//        System.out.println(person.address); It is private that's why we can't access it, to access it we have a getter method which we'll see later
        System.out.println(person.company);
    }
}
