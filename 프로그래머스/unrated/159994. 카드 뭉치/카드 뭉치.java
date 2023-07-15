import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int indexCards1 = 0;
        int indexCards2 = 0;
        
        for(int i = 0; i < goal.length; i++) {
            if(indexCards1 < cards1.length && goal[i].equals(cards1[indexCards1])) {
                indexCards1++; 
            } else if(indexCards2 < cards2.length && goal[i].equals(cards2[indexCards2])) {
                indexCards2++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}