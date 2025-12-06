public class Main {
    public static void main(String[] args) {

        Person person=new Person();
        person.name="Alfred";
        person.sayHi();

        Person.Student student=new Person.Student();
        student.printAnything();
    }
}
