# Static keyword
 
We use **static** keyword to specify that an attribute, a block, a method, our a nested class belong to the class.
We can use the Static keyword in four ways:

## Static attribute
A static attribute is also known as class attribute, they can belong to the class itself not to a specific instance.

## Static Block
A static block is executed only once when the class is first loaded into memory.  It is often used to initialize static
variables or perform configuration tasks before the main method executes.

## Static Methods
A static method belongs to the class not to any specific object. It can be called directly using the class name.

- Cannot use this or super keywords.
- Cannot access instance variables or methods directly.
- Can access only static data directly.

## Static Nested Classes 
A static nested class is a class declared as static inside another class. It can be accessed without creating an object 
of the outer class.

