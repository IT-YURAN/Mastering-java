public class Person {

    String name;
    int age;

    static { //this is a block, and I'll dive into it later so I can Understand
        System.out.println("Printing from a block");
    }

    public Person() { // a Constructor that does not take any parameter
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHi(){ //can only be accessed by a specific object not the class itself
        System.out.println("Hi I'm: "+name);
    }

    static class Student{ //Static inner class, We'll dive into nested class later

        public void printAnything(){
            System.out.println("Printing from the inner class Student");
        }
    }

}
