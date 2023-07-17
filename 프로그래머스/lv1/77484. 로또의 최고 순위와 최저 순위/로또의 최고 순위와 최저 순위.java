class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int zero = 0;
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(lottos[i] == win_nums[j]) {
                    cnt++;
                }
            }
            if(lottos[i] == 0) zero++;
        }
        
        answer[0] = 7 - (cnt + zero) > 6 ? 6 : 7 - (cnt + zero);
        answer[1] = cnt == 0 ? 6 : 7 - cnt;
        
        return answer;
    }
}