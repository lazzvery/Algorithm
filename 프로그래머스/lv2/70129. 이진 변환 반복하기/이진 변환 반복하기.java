class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zero = 0;
        
        while(s.length() > 1) {
            int num = 0;
            
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') {
                    zero++;
                } else {
                    num++;
                }
            }
            
            s = Integer.toBinaryString(num);
            cnt++;
            
        }
        
        answer[0] = cnt;
        answer[1] = zero;
        
        return answer;
    }
}