// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;
import java.util.Arrays;


public class DynamicArray<T> implements IndexAccess<T>{
    
    // What instance variables do you need?
    private T[] baseArray;
    private int offset;


    
   // private int highindex;
   // private int lowindex;
    
    // Write a constructor to make a new DynamicArray Object from an array
    public DynamicArray(int offset,T[]message){
      this.baseArray = (T[]) new Object[message.length];

      
      for (int i = 0; i < message.length; i++){
        baseArray[i] = message[i];
      }

      this.offset=offset;
    }



    // Now implement the methods from IndexAccess?
    public T get(int i){
        return baseArray[i];
    }

    public T get(int i, int offset){
       
        //still need a throw exception or try catch in case the i is more than the elements in array
        // if ( (i+ offset) >= baseArray.length ){
        //     offset = offset % baseArray.length;

        // }

        return baseArray[(i+offset) % baseArray.length];
    }

    public T getdecode(int i, int offset){
      int index = (i+offset) % baseArray.length;
      return baseArray[index];
  }

  public T getencode(int i, int offset){
    int index = (i-offset) % baseArray.length;
    if (index <0){
      index = index + 26;
    }

    return baseArray[index];
}



    public void set(int i, T val){
        baseArray[i] = val;
    }

    // public static void main(String[] args) {
    //     DynamicArray<T> mDynamicArray = new DynamicArray<T>(3, "Whatttt");
    // }



}