// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

//trying to check if publishing works
public class CaesarCipher {

    /** Character array to store the letters in the alphabet in order */
    Character[] alphabet;

    /** DynamicArray object providing ArrayList-like operations for Characters */
    DynamicArray<Character> cipher;

    /** Private offset that tracks how many positions to shift the index for
    * This cipher */
    private int offset;

    /** Constructor that should define the instance variables, including
     * populating the alphabet
     * @param offset Offset to use when creating `cipher` of DynamicArray type
     */
    public CaesarCipher(int offset){
        // Fill in here
     
        this.alphabet = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        this.offset = offset;
        this.cipher = new DynamicArray<Character>(this.offset, this.alphabet);
        
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        // This is a stub -- fill in the code and return the
        // value you calculate
        int i=0;
        int index=0;
        while(alphabet[i] != val){
            i++;
            index++;
        }
        return index;

       
    }

    /** Encode a message using the cipher
     * @param T message to encode
     * @return encoded message */  
    // public String encode(String message){
    //     // Fill in here and update return statement based on your code
    //     int position = 0;
    //     int newPosition = 0; //for the index of the new letter that we get after offset is applied
    //     char[] mArray = message.toCharArray();
    //     for (int i = 0; i < message.length(); i++  ){

    //         position = this.findIndex(mArray[i]); 
    //         newPosition = position+offset;
    //         if (newPosition>message.length()){
    //             newPosition = (position+offset)%message.length();
    //         }
    //         mArray[i] = alphabet[newPosition];
    //     }
    //     return new String(mArray.toString()); 
    //  }

     public String encode(String message){
        // Fill in here and update return statement based on your code
        char[] mArray = message.toLowerCase().toCharArray();
        for (int i = 0; i < message.length(); i++  ){
            if (Character.isAlphabetic(mArray[i])){
                System.out.println(cipher.get(this.findIndex(mArray[i]), offset) ) ;
                mArray[i] = cipher.getencode(this.findIndex(mArray[i]), offset);
                
            } else{
                mArray[i] = mArray[i];
            }
        }
        System.out.println(new String(mArray));
        return new String(mArray); 
     }

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        // Fill in here and update return statement based on your code
        char[] mArray = message.toLowerCase().toCharArray();
        for (int i = 0; i < message.length(); i++  ){
            if (Character.isAlphabetic(mArray[i])){
                System.out.println(cipher.getdecode(this.findIndex(mArray[i]), offset) ) ;
                mArray[i] = cipher.getdecode(this.findIndex(mArray[i]), offset);
                
            } else{
                mArray[i] = mArray[i];
            }
        }
        System.out.println(new String(mArray));
        return new String(mArray); 
        
    }

    public char get(int index){
        return this.alphabet[(((index-offset)+alphabet.length)%alphabet.length)];
    }

    public static void main(String[] args) {
        CaesarCipher myCaesarCipher = new CaesarCipher(3);
        myCaesarCipher.encode("Hello");

    }
    
}
