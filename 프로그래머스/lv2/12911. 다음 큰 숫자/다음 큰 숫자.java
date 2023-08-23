import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n);
        
        while(answer == 0) {
            n++;
            
            if(cnt == Integer.bitCount(n)) {
                answer = n;
            }
        }
        
        return answer;
    }
}