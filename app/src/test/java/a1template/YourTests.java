// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

import org.junit.Test;
import static org.junit.Assert.*;

public class YourTests {
    @Test 
    public void EdgeCaseTest() {
        CaesarCipher classUnderTest = new CaesarCipher(26);
        assertEquals(0,classUnderTest.findIndex('a'));
        assertEquals(12,classUnderTest.findIndex('m'));
        assertEquals(25,classUnderTest.findIndex('z'));
    }

    

}