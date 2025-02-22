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
        this.alphabet = new Character[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }
        this.offset = offset;
        this.cipher = new DynamicArray<>(26, alphabet);
    }

    /** Implementation of linear search that looks through the alphabet
     * array to identify the position of the passed value
     * @param val character to search for
     * @return int indicating position of val in the alphabet array
     */
    public int findIndex(char val){
        // This is a stub -- fill in the code and return the
        // value you calculate
        int position = 0;
        for (int i=0; i<26; i++){
            if (alphabet[i]==val){
                position = i;
            }
        }
        return position;
    }

    /** Encode a message using the cipher
     * @param T message to encode
     * @return encoded message */  
    public String encode(String message){
        // Fill in here and update return statement based on your code
        char[] msgArray = message.toCharArray();
        int length = message.length();

        for (int i=0; i<length; i++){
            if (Character.isLetter(msgArray[i])){
                int x = findIndex(msgArray[i]); // x is the # of the alphabet
                int encodeIndex = (((x - offset)%26)+26)%26;
                msgArray[i] = alphabet[encodeIndex];
            }
        }

        return new String(msgArray); 
     }


    /** Decode a message using the cipher 
     * @param String message to decode
     * @param int key to use in decoding
     * @return decoded message
    */
    public String decode(String message){
        // Fill in here and update return statement based on your code
        char[] msgArray = message.toCharArray();
        int length = message.length();

        for (int i=0; i<length; i++){
            if (Character.isLetter(msgArray[i])){
                int x = findIndex(msgArray[i]); // x is the # of the alphabet
                int decodeIndex = ((Math.abs(x + offset)%26)+26)%26;
                msgArray[i] = alphabet[decodeIndex];
            }
        }
        
        return new String(msgArray); 
    }

    /**
     * Retrieves the character in the specified index.
     * @param index the location of the character that needs to be returned.
     * @return the character in the specified index.
     */
    public char get(int index){
        int n = ((((index - offset))%26)+26)%26;
        char x = alphabet[n];
        return x;
    }

    public static void main(String[] args) {
    }
    
}
