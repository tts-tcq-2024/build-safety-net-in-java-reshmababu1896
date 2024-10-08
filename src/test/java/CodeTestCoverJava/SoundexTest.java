package CodeTestCoverJava;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

import org.junit.Test;

public class SoundexTest {
    Soundex soundexMock = Mockito.mock(Soundex.class);

    @Test
    public void testEmptyString() {
        assertEquals("", Soundex.generateSoundex(""));
    }

    @Test
    public void testSingleCharacter() {
        assertEquals("A000", Soundex.generateSoundex("A"));
    }

    @Test
    public void testStringB200() {
        assertEquals("B200", Soundex.generateSoundex("BOSCH"));
    }
     @Test
    public void testStringS552() {
         assertEquals("S552", Soundex.generateSoundex("Siemens"));
    }
    
    @Test
    public void testNullString() {
        assertEquals("", Soundex.generateSoundex(null));
    }  
}
