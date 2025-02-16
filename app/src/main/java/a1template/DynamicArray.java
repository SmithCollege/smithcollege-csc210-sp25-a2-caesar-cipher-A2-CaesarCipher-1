// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    private T[] storage; //the underlying array
    private int n; //the number of elements stored 
    // private int capacity; //the total capacity of the array

    // Write a constructor to make a new DynamicArray Object from an array

    // Now implement the methods from IndexAccess?
    public T get(int index){
        indexNum(index);
        return storage[index];
    }

    public T get(int index, int offset){
        indexNum(index);
        int x = 0;
        if (index + offset >= n){
            x = offset %n;
        }
        return storage[index+x];
    }

    public void set(int index, T element){
        indexNum(index);
        storage[index] = element;
    }

    public void indexNum(int index){
        if (index < 0 || index >= n){
            //throw?
        }
    }

}