class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = "";
        
        while(n > 0) {
            s += n % 3;
            n /= 3;
        }
        
        int num = 1;
        for(int i = 1; i <= s.length(); i++) {
            answer += num * (s.charAt(s.length() - i) - '0');
            System.out.println(answer);
            num *= 3;
        }
        
        return answer;
    }
}