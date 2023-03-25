class Solution {
    public int[] solution(long n) {
        String s = "" + n;
		int[] answer = new int[s.length()];
		
        for(int i = 0; i < s.length(); i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        
		return answer;
    }
}