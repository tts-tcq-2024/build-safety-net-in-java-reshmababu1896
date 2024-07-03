package CodeTestCoverJava;

public class Soundex {

   public static String generateSoundex(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        name = name.toUpperCase();
        StringBuilder soundex = new StringBuilder();
        soundex.append(name.charAt(0));


        for (int i = 1; i < name.length() && soundex.length() < 4; i++) {
            char code = getSoundexCode(name.charAt(i));
            char prevCode = getSoundexCode(name.charAt(i - 1));
            if (code != '0' && code != prevCode) {
                soundex.append(code);
            }
        }

        if (soundex.length() < 4) {
            soundex.append('0');
        }
        return soundex.toString();
    }

    private static char getSoundexCode(char c) {
        switch (c) {
            case 'B': case 'F': case 'P': case 'V':
                return '1';
            case 'C': case 'G': case 'J': case 'K': case 'Q': case 'S': case 'X': case 'Z':
                return '2';
            case 'D': case 'T':
                return '3';
            case 'L':
                return '4';
            case 'M': case 'N':
                return '5';
            case 'R':
                return '6';
            default:
                return '0'; // For A, E, I, O, U, H, W, Y
        }
    }
}
