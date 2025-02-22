// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;
import java.util.Arrays;

public class DynamicArray<T> implements IndexAccess<T>{

    
    // The array that stores the elements
    private T[] baseArray;
    // The number of elements in the array
    private int n;
    // The offset number used to shift characters, to encode and decode
    private int offset;

    /**
     * Constructor of DynamicArray
     * @param mysteryInt  I have implemented this parameter to make the tests work. 
     *                    While it was always the same number as the offset, mysteryInt
     *                    is not currently needed/used in this implementation.
     * @param givenArray the array to initialize the DynamicArray with.
     */
    public DynamicArray(int mysteryInt, T[] givenArray) {
        this.n = givenArray.length;
        this.baseArray = Arrays.copyOf(givenArray, n);
        this.offset = 0;
    }
    /**
     * Returns the element stored at the given index.
     * @param index the index of the element.
     * @return the value stored at the given index.
     * @throws ArrayIndexOutOfBoundsException if the provided index is invalid.
     */
    public T get(int index) {
        return baseArray[indexNum(index)];
    }

    /**
     * Returns the element stored at the given index.
     * @param index the index of the element.
     * @param offset the offset that is added to the index.
     * @return the value stored at the given index.
     * @throws ArrayIndexOutOfBoundsException if the provided index is invalid.
     */
    public T get(int index, int offset) {
        return baseArray[indexNum(index + offset)];
    }


    /**
     * Sets the given element at the given index.
     * @param index the index where the element is stored at.
     * @param element the element that is stored in the array.
     * @throws ArrayIndexOutOfBoundsException if the provided index is invalid.
     */
    public void set(int index, T element) {
        baseArray[indexNum(index)] = element;
        
    }

    /**
     * Calculates the actual index in the underlying array,
     * making sure that the index is valid and 
     * the offset is properly considered.
     * @param index the index number we're working with.
     * @return the actual index that is valid in baseArray.
     */
    private int indexNum(int index) {
        int actualIndex = (index + offset) % n;
        actualIndex = (actualIndex + n) % n; // Handles both positive and negative indices
        return actualIndex;
    }

}