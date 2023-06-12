class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i : numbers) {
            answer += i;
        }
        
        answer = 45 - answer;
        
        return answer;
    }
}