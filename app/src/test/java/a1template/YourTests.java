// Do not change the line below. It lets Gradle find your 
// Classes to build the project
package a1template;

import org.junit.Test;
import static org.junit.Assert.*;

public class YourTests {
    
    @Test
    public void encodeTest(){
        CaesarCipher testOne = new CaesarCipher(5);
        assertEquals("yvov nxdzixz", testOne.encode("data science"));
        
        CaesarCipher testTwo = new CaesarCipher(13);
        assertEquals("cvt gb zna, naq sebz zna gb cvt, naq sebz cvt gb zna ntnva", testTwo.encode("pig to man, and from man to pig, and from pig to man again"));
    }


    @Test
    public void decodeTest(){
        CaesarCipher testOne = new CaesarCipher(3);
        assertEquals("hello, world!", testOne.decode("ebiil, tloia!"));

        CaesarCipher testTwo = new CaesarCipher(7);
        assertEquals("fergalicious, definition make them boys go loco", testTwo.decode("yxkztebvbhnl, wxybgbmbhg ftdx maxf uhrl zh ehvh"));
    }

}