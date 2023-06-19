class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int cnt = 0;
        
        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    answer = number[i] + number[j];
                    
                    if(answer + number[k] == 0) cnt++;
                }
            }
        }
        
        return cnt;
    }
}