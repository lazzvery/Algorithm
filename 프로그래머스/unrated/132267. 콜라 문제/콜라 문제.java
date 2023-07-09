class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain = 0;
        
        while(true) {
            remain = n % a;
            answer += n / a * b;
            n = n / a * b + remain;
            
            if(n < a) break;
        }
        
        return answer;
    }
}