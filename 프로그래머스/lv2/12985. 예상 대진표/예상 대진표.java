class Solution {
    public int solution(int n, int a, int b) {
        int answer = 0;
        
        while(true) {
            if(a != b) {
                a = (a + 1) / 2;
                b = (b + 1) / 2;
            } else {
                break;
            }
            
            answer++;
        }

        return answer;
    }
}