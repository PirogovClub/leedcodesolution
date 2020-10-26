package LongestSubstringWithoutRepeatingCharacters;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SolutionWithTracks implements Solution {

    @Override
    public int lengthOfLongestSubstring(String s) {

        if (s.length()<=1){ return s.length();}
        //initialisation
        Map<Character,Integer> charactersPosition = new HashMap<Character,Integer>();
        charactersPosition.put(s.charAt(0),0);
        int longestSbstLengh = 1;
        int lastSubStBeginPos = 0;
        int currentSbstrLengh = 1;

        for (int i=1;i<s.length();i++){
            System.out.println("Original Stringr:"+s);
            System.out.println("current Character:"+s.charAt(i));
            if (charactersPosition.get(s.charAt(i))!=null){
                int tmpPos=charactersPosition.get(s.charAt(i));
                if (longestSbstLengh<currentSbstrLengh) {longestSbstLengh=currentSbstrLengh;}
                currentSbstrLengh=i-tmpPos;
                for (int j=lastSubStBeginPos;j<=tmpPos;j++){
                    charactersPosition.remove(s.charAt(j));
                    System.out.println("removing hash:"+charactersPosition.toString());
                }
                lastSubStBeginPos = tmpPos+1;

            } else {
                currentSbstrLengh++;
            }
            charactersPosition.put(s.charAt(i),i);
            System.out.println("current hash:"+charactersPosition.toString());
            System.out.println("current longestSbstLengh:"+longestSbstLengh);
            System.out.println("current substring :"+ s.substring(lastSubStBeginPos,i+1));
            System.out.println("current currentSbstrLengh:"+currentSbstrLengh);
            System.out.println("----------");
        }
        if (longestSbstLengh<currentSbstrLengh) {longestSbstLengh=currentSbstrLengh;}

        return longestSbstLengh;
    }


}
