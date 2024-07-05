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
        String value=Soundex.generateSoundex("A");
        assertEquals("A000", value);
    }

    @Test
    public void testString1() {
        String value=Soundex.generateSoundex("BOSCH");
        assertEquals("B200", value);
    }
     @Test
    public void testString2() {
         String value=Soundex.generateSoundex("Siemens");
         assertEquals("S552", value);
    }
    
    @Test
    public void testNullString() {
        assertTrue(Soundex.generateSoundex(null)=="");
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
