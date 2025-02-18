// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;
import java.util.Arrays;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    private T[] baseArray;
    private int n;
    private int offset;

    // Write a constructor to make a new DynamicArray Object from an array
    public DynamicArray(int givenCapacity, T[] givenArray) {
        this.n = givenArray.length;
        this.baseArray = Arrays.copyOf(givenArray, n);
        this.offset = 0;
    }

    // Now implement the methods from IndexAccess?
    public T get(int index) {
        return baseArray[indexNum(index)];
    }

    public T get(int index, int offset) {
        return baseArray[indexNum(index + offset)];
    }

    public void set(int index, T element) {
        baseArray[indexNum(index)] = element;
    }

    private int indexNum(int index) {
        int actualIndex = (index + offset) % n;
        actualIndex = (actualIndex + n) % n; // Handles both positive and negative indices
        return actualIndex;
    }

}