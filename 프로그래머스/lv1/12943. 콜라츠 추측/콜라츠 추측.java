class Solution {
    public int solution(long num) {
        long answer = num;
        int cnt = 0;
        
        while(answer != 1) {
            if(answer % 2 == 0) {
                answer /= 2;
            } else {
                answer = (answer * 3) + 1;
            }
            
            cnt++;
            if(cnt == 500) return -1;
        }
        
        return cnt;
    }
}