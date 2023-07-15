import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        if(score.length < m) return 0;
        
        Arrays.sort(score);
        
        for(int i = score.length % m; i < score.length; i += m) {
            answer = answer + (score[i] * m);
        }
        
        return answer;
    }
}