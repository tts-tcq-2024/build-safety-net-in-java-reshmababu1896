package CodeTestCoverJava;

import java.util.HashMap;
import java.util.Map;

public class Soundex {

   static Map<String, Character> soundexCodeMap=generateMap();
   static StringBuilder soundex = new StringBuilder();
    public static Map<String, Character> generateMap() {
        Map<String, Character> soundexCodeMap = new HashMap<>();
        soundexCodeMap.put("BFPV", '1');
        soundexCodeMap.put("CGJKQSXZ", '2');
        soundexCodeMap.put("DT", '3');
        soundexCodeMap.put("L", '4');
        soundexCodeMap.put("MN", '5');
        soundexCodeMap.put("R", '6');
        soundexCodeMap.put("AEIOUHWY", '0');
        return soundexCodeMap;
    }
   
    public static String generateSoundex(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        name = name.toUpperCase();
        StringBuilder soundex = new StringBuilder();
        soundex.append(name.charAt(0));
        checkLength(soundex, name);
        return appendZero(soundex).toString();
    }
   
   protected static StringBuilder appendZero(StringBuilder soundex) {
        while (soundex.length() < 4) {
            soundex.append('0');
        }
     System.out.println("Soundex out put is ********************  "+soundex);
        return soundex;
    }
   
   public static void checkLength(StringBuilder soundex, String name) {
        for (int i = 1; i < name.length() && soundex.length() < 4; i++) {
            char currentChar = name.charAt(i);
            char previousChar = name.charAt(i - 1);

            char code = getSoundexCode(currentChar);
            char prevCode = getSoundexCode(previousChar);

            appendCode(code, prevCode, soundex);
        }
    }

   protected static void appendCode(char currentCode, char prevCode, StringBuilder soundex) {
        if (currentCode != '0' && currentCode != prevCode) {
            soundex.append(currentCode);
        }
    }
   

    protected static char getSoundexCode(char c) {
        c = Character.toUpperCase(c);
        for (Map.Entry<String, Character> entry : soundexCodeMap.entrySet()) {
            if (entry.getKey().contains(String.valueOf(c))) {
                return entry.getValue();
            }
        }
        return '0';
    }
}
