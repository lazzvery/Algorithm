class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long s, m;
        
        if(a > b) {
            s = b;
            m = a;
        } else {
            s = a;
            m = b;
        }
        
        for(long i = s; i <= m; i++) {
            answer += i;
        }
        
        return answer;
    }
}