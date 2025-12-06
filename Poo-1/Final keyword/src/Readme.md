# Final keyword

The final keyword is a non-access modifier used to restrict modification. It applies to attributes, methods,classes.
It helps create constants, control inheritance and enforce fixed behavior.

**The following are different contexts where the final is used:**

- Attributes/variable
- Methods
- Classes

## Final Variable
A variable declared with final becomes constant after one assignment.
    
            `public class Main{
            
                public static void main(String[] args) {
                    final double PI = 3.14159;
                    System.out.println("Value of PI: " + PI);
                }
            }`

##  Final class

A class declared as final cannot be extended.

    `
        final class A {
        // fields and methods
    }
    
    // Illegal
    class B extends A { }`
**Final classes are useful when creating immutable classes such as String or wrapper classes.**

## Final Method

When a method is declared with final keyword, it is called a final method in Java. A final method cannot be overridden.

    class A {
    final void m1() {
    System.out.println("Final method");
    }
    }
    
    class B extends A {
    void m1() { } // compile-time error
    }