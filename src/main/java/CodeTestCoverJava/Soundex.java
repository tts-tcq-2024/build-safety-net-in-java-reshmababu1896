package CodeTestCoverJava;

public class Soundex {

   static Map<String, Character> soundexCodeMap=generateMap();
   static StringBuilder soundex = new StringBuilder();
    public static Map<String, Character> generateMap() {
        soundexCodeMap=new HashMap<>();
        soundexCodeMap.put("BFPV", '1');
        soundexCodeMap.put("CGJKQSXZ", '2');
        soundexCodeMap.put("DT", '3');
        soundexCodeMap.put("L", '4');
        soundexCodeMap.put("M", '5');
        soundexCodeMap.put("R", '6');
        soundexCodeMap.put("AEIOUHWY", '0');
        return null;
    }
    public static String generateSoundex(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        name = name.toUpperCase();
        StringBuilder soundex = new StringBuilder();
        soundex.append(name.charAt(0));


        for (int i = 1; i < name.length(); i++) {
           char currentChar = name.charAt(i);
           char previousChar = name.charAt(i - 1);

           char code = getSoundexCode(currentChar);
           char prevCode = getSoundexCode(previousChar);

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

        for (Map.Entry<String,Character> entry : soundexCodeMap.entrySet()){
            if(entry.getKey().contains(String.valueOf(c))){
                return entry.getValue();
            }
        }
        return '0';
    }
}
