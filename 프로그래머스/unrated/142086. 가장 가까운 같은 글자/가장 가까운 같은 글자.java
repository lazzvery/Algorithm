import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] tmp = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            if(tmp[s.charAt(i) - 97] == 0) {
                answer[i] = -1;
                tmp[s.charAt(i) - 97] = i + 1;
            } else {
                answer[i] = i - tmp[s.charAt(i) - 97] + 1;
                tmp[s.charAt(i) - 97] = i + 1;
            }
        }
        return answer;
    }
}