package CodeTestCoverJava;

import static org.junit.Assert.assertTrue;
import org.mockito.Mockito;

import org.junit.Test;

public class SoundexTest {
    Soundex soundexMock = Mockito.mock(Soundex.class);

    @Test
    public void testEmptyString() {
        assertTrue(Soundex.generateSoundex("")=="");
    }

    // @Test
    // public void testSingleCharacter() {
    //      assertTrue(Soundex.generateSoundex("A")=="A000");
    // }

    @Test
    public void testString1() {
        assertTrue(Soundex.generateSoundex("BOSCH")=="B200");
    }
     @Test
    public void testString2() {
        assertTrue(Soundex.generateSoundex("Siemens")=="S250");
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
