import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> king = new ArrayList<Integer>();
        
        for(int i = 0; i < score.length; i++) {
            if(i < k) {
                king.add(score[i]);
                Collections.sort(king);
                answer[i] = king.get(0);
            } else {
                if(score[i] > king.get(0)) {
                    king.set(0, score[i]);
                    Collections.sort(king);
                }
                answer[i] = king.get(0);
            }
        }
        
        return answer;
    }
}