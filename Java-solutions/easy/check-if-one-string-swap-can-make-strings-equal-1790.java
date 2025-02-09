package easy;
/*
You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.

 
Example 1:

Input: s1 = "bank", s2 = "kanb"
Output: true
Explanation: For example, swap the first character with the last character of s2 to make "bank".
Example 2:

Input: s1 = "attack", s2 = "defend"
Output: false
Explanation: It is impossible to make them equal with one string swap.
Example 3:

Input: s1 = "kelb", s2 = "kelb"
Output: true
Explanation: The two strings are already equal, so no string swap operation is required.
 

Constraints:

1 <= s1.length, s2.length <= 100
s1.length == s2.length
s1 and s2 consist of only lowercase English letters.
*/ 
import java.util.Arrays;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
            if(s1.equals(s2)) {
                return true;
            }
            
            if(s1.length() != s2.length()) {
                return false;
            }

            ArrayList<String> sameLetters = new ArrayList<String>();

            ArrayList<String> differentLetters1 = new ArrayList<String>();
            ArrayList<String> differentLetters2 = new ArrayList<String>();

            for(int i = 0; i < s1.length(); i++) {
                if(s1.charAt(i) == s2.charAt(i)) {
                    sameLetters.add(Character.toString(s1.charAt(i)));
                } else {
                    differentLetters1.add(Character.toString(s1.charAt(i)));
                                System.out.println("s1 " + s1.charAt(i));
                                System.out.println("s2 " + s2.charAt(i));

                    differentLetters2.add(Character.toString(s2.charAt(i)));
            }
            }

            if(differentLetters1.size() < 2) {
                return false;
            }

        if(differentLetters1.get(0).equals(differentLetters2.get(1)) && differentLetters1.get(1).equals(differentLetters2.get(0)) && differentLetters1.size() == 2) 
         {
            System.out.println("bbooggogogoe");
            return true;
        } else {
            return false;
        }

    }
}