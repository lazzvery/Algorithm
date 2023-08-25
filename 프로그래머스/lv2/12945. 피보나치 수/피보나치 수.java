class Solution {
    public int solution(int n) {
        int answer = 0;
        int before1 = 0;
        int before2 = 1;
        
        for(int i = 1; i < n; i++) {
            answer = (before1 + before2) % 1234567;
            before1 = before2;
            before2 = answer;
        }
        
        return answer;
    }
}