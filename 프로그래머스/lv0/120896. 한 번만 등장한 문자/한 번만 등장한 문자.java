import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                answer += s.charAt(i);
            }
        }
        
        char arr[] = answer.toCharArray();
        Arrays.sort(arr);
        
        return String.valueOf(arr);
    }
}