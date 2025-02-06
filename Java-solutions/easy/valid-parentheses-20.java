/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'. */

package easy;

class Solution {
    public boolean isValid(String s) {
            Stack<String> STACK = new Stack<String>();

        boolean result = true;
        int count = 0;
        int first = 0;
        for(int i = 0; i < s.length(); i++) {
            String t1 = Character.toString(s.charAt(i));
            //String t0 = Character.toString(s.charAt(i-1));
            
            String t2 = "";
            if(i != s.length()-1) {
            t2 = Character.toString(s.charAt(i+1));
            }

            //System.out.println(STACK);
            System.out.println(t1);
            //System.out.println(t0);
            if(i == 0) {
            if(t1.equals(")") || t1.equals("]") || t1.equals("}")) {
                first++;
            }
            }
          

           if(t1.equals("(") || t1.equals("{") || t1.equals("[")) {
            STACK.push(t1);
            count++;
            System.out.println(STACK);
           }
           
           if(!STACK.empty()) {
            if(t1.equals(")") || t1.equals("}") || t1.equals("]")) {
            if(STACK.peek().equals("(") && t1.equals(")")) {
                STACK.pop();
            }else if(STACK.peek().equals("{") && t1.equals("}")) {
                STACK.pop();
            } else if(STACK.peek().equals("[") && t1.equals("]")) {
                STACK.pop();
            } else {
                first++;
            }
           }
           }

           int remainder = s.length() % 2;
           if(STACK.empty() && remainder != 0) {
                        if(t1.equals(")") || t1.equals("}") || t1.equals("]")) {
                        first++;
                        }
           }

           if(STACK.empty() && i != s.length()-1) {
            if(t1.equals(")") || t1.equals("}") || t1.equals("]") && i != s.length()-1) {
                if(t2.equals(")") || t2.equals("}") || t2.equals("]") ) {
                    first++;
                }
            }
           }
                  
}
if(STACK.empty() && count > 0 && first == 0) {
            return true;
           } else {
return false;
           } 


}
}