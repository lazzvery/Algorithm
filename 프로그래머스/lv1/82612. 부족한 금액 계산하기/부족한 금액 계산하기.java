class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        
        for(int i = 1; i <= count; i++) {
            answer += price * i;
        }
        
        if(money - answer < 0) return -(money - answer);
        
        return 0;
    }
}