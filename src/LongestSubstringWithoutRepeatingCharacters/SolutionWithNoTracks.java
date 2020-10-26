package LongestSubstringWithoutRepeatingCharacters;


import java.util.HashMap;
import java.util.Map;

public class SolutionWithNoTracks implements Solution {
    @Override
    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1) {
            return s.length();
        }
        Map<Character, Integer> charactersPosition = new HashMap<Character, Integer>();
        charactersPosition.put(s.charAt(0), 0);
        int longestSbstLengh = 1;
        int lastSubStBeginPos = 0;
        int currentSbstrLengh = 1;

        for (int i = 1; i < s.length(); i++) {
            if (charactersPosition.get(s.charAt(i)) != null) {
                int tmpPos = charactersPosition.get(s.charAt(i));
                if (longestSbstLengh < currentSbstrLengh) {
                    longestSbstLengh = currentSbstrLengh;
                }
                currentSbstrLengh = i - tmpPos;
                for (int j = lastSubStBeginPos; j <= tmpPos; j++) {
                    charactersPosition.remove(s.charAt(j));
                    System.out.println("removing hash:" + charactersPosition.toString());
                }
                lastSubStBeginPos = tmpPos + 1;

            } else {
                currentSbstrLengh++;
            }
            charactersPosition.put(s.charAt(i), i);
        }
        if (longestSbstLengh < currentSbstrLengh) {
            longestSbstLengh = currentSbstrLengh;
        }

        return longestSbstLengh;
    }

}
