import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        for(int i = 3; i <= total; i++) {
            if(total % i == 0) {
                int num = total / i;
                
                if((i - 2) * (num - 2) == yellow) {
                    answer[0] = Math.max(i, num);
                    answer[1] = Math.min(i, num);
                }
            }
        }
        
        return answer;
    }
}