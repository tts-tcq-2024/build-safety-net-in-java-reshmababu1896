package CodeTestCoverJava;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.mockito.Mockito;

import org.junit.Test;

public class SoundexTest {
    Soundex soundexMock = Mockito.mock(Soundex.class);

    @Test
    public void testEmptyString() {
        assertTrue(Soundex.generateSoundex("")=="");
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("A000", Soundex.generateSoundex("A"));
    }

    @Test
    public void testString1() {
        assertEquals("B200", Soundex.generateSoundex("BOSCH"));
    }
     @Test
    public void testString2() {
         assertEquals("S552", Soundex.generateSoundex("Siemens"));
    }
    
    @Test
    public void testNullString() {
        assertEquals("", Soundex.generateSoundex(null));
    }
    
    //  @Test
    // public void testVerifyCheckLengthIsCalled() {
    //     StringBuilder soundex=new StringBuilder();
    //     String name="AEIOU";
    //     soundexMock.generateSoundex(name);
    //    Mockito.verify(soundexMock, Mockito.times(1)).checkLength(soundex,name);
    //     // verify(soundexMock. Mockito.times(1)).checkLength(soundex,name);
    // }
    
    
}
