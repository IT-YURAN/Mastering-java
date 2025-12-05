# Arrays

Arrays is an important linear data structure that allows us to store multiple values of the same type in a unique variable.

- Arrays in Java are objects, like all other objects in Java, arrays implicitly inherit from the java.lang.Object class.
- This allows you to invoke methods defined in Object (such as toString(), equals() and hashCode()). 
- Arrays have a built-in length property, which provides the number of elements in the array.

## Key features of Arrays
**Store Primitives and Objects:**Java arrays can hold both primitive types (like int, char, boolean, etc.) and objects
(like String, Integer, etc.)
**contiguous Memory Allocation:**When we use arrays of primitive types, the elements are stored in contiguous 
locations. For non-primitive types, references of items are stored at contiguous locations.
**Zero-based Indexing:**The first element of the array is at index 0.
**Fixed Length:** After creating an array, its size is fixed; we can not change it.


## Basics Operation on Arrays in Java

1. Declaring an Array
   The general form of array declaration is: 
    ` Method 1:
   int arr[]; 
    Method 2:
   int[] arr;`
2.  Initialization an Array in Java 
    When an array is declared, only a reference of an array is created. We use new to allocate an array of given size.
`    int arr[] = new int[size];`

## Arrays of Objects in Java

**An array of objects is created like an array of primitive-type data items** 
