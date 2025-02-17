// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    private T[] arr;
    private int offset;

    // Write a constructor to make a new DynamicArray Object from an array

    public DynamicArray(int offset, T[] inArr) { //constructor

        this.arr = (T[]) new Object[inArr.length];
        this.offset = offset;

        for(int i = 0; i< inArr.length; i++){
            this.arr[i] = inArr[i];
        }

    }

    // Now implement the methods from IndexAccess?
    /** Returns the value stored at a given index
     * @param i index of element to read
     * @return value stored at the given index
     */
    public T get(int i){
        return arr[i];
    }

    /** Returns the value stored at a given index plus the offset
     * @param i index of element to read
     * @param offset adjust index by this value
     * @return value stored at the given index
     */
    public T get(int i, int offset){
        return arr[((i+offset) % 26)];  
    }

    /** Stores the given value at the given index
     * @param i index of locaßtion to store
     * @param val value to store at given index
     */
    public void set(int i, T val){
        arr[i] = val;
    }

    /**
     * Return the index of a value in the dynamic array
     * @param val value to look for
     * @return index of the value
     */
    public int indexOf(T val){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }

}