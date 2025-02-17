// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

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

    CaesarCipher(int offset){
        // Fill in here
        this.offset = offset;
        this.alphabet = new Character[26];

        // int counter = 0;
        // for(int i = offset; i < 26; i++){
        //     this.alphabet[counter] = Character.valueOf((char) ('a' + i));
        //     counter++;
        // }
        // for(int i = 0; i < offset; i++){
        //     this.alphabet[counter] = Character.valueOf((char) ('a' + i));
        //     counter++;
        // }  

        for (int i = 0; i < 26; i++) {
             alphabet[i] = Character.valueOf((char) ('a' + i));
        }
        this.cipher = new DynamicArray<Character>(offset, alphabet);
        for(int i = 0; i < alphabet.length; i++){
            this.cipher.set(i, alphabet[(i - offset + 26) % 26]);
        }
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        // This is a stub -- fill in the code and return the
        // value you calculate
        for(int i = 0; i < 26; i++ ) {
            if(alphabet[i] == val){
                return i;
            }
        }
        return -1;
    }

    /** Encode a message using the cipher
     * @param T message to encode
     * @return encoded message */  
    public String encode(String message){
        // Fill in here and update return statement based on your code
        String encoded = "";
        char[] messageArr = message.toLowerCase().toCharArray(); //creates a character array from the message
        for (char letter : messageArr) {
            int pos = findIndex(letter);
            if (pos != -1) {
                encoded += cipher.get(pos);
            } else {
                encoded += letter; // keep space or puntuation characters unchanged
            }
        }
        return encoded;
     }

    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        // Fill in here and update return statement based on your code
        String decoded = "";
        char[] messageArr = message.toLowerCase().toCharArray();
        for (char letter : messageArr) {
            int pos = cipher.indexOf(letter);
            if (pos != -1) {
                decoded += alphabet[pos];
            } else {
                decoded += letter; // keep space or puntuation characters unchanged
            }
        }
        return decoded;
    }

    public char get(int index){
        return cipher.get(index);
    }

    public static void main(String[] args) {
    }
    
}
