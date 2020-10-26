package LongestSubstringWithoutRepeatingCharacters;



public class main {

    public static void main(String[] args) {
        System.out.println("start");
        Solution calc = new SolutionWithNoTracks();
        String stringToLook = "ppaa";
        System.out.println(stringToLook);
        int longestSubs = calc.lengthOfLongestSubstring(stringToLook);
        System.out.println(longestSubs);
        System.out.println("finish");

    }


}
