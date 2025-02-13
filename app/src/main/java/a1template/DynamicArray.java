// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    char [] baseArray;
    int offset;
    int highIndex;
    int lowIndex; 

    // Write a constructor to make a new DynamicArray Object from an array
    public DynamicArray(char [] baseArray,int offset, int highIndex, int lowIndex ){
        this.baseArray=baseArray;
        this.offset=offset;
        this.highIndex=highIndex;
        this.lowIndex=lowIndex;
    }

 }
 // Now implement the methods from IndexAccess?

