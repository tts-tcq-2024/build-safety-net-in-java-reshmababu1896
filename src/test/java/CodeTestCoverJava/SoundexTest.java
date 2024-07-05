package CodeTestCoverJava;

import static org.junit.Assert.assertTrue;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class SoundexTest {
    Soundex spyObject=Mockito.spy(Soundex);

    @Test
    public void testEmptyString() {
        assertTrue(Soundex.generateSoundex("")=="");
    }

    @Test
    public void testSingleCharacter() {
         assertTrue(Soundex.generateSoundex("A")=="A000");
    }
    
    @Test
    public void testNullString() {
        assertTrue(Soundex.generateSoundex(null)=="");
    }
    
     @Test
    public void testNullString() {
        StringBuilder soundex=new StringBuilder();
        String name="AEIOU";
        spyObject.generateSoundex(name);
        verify(spyObject, times(1)).checkLength(soundex,name);
    }
    
    
}
