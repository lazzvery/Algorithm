class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n + 1];
        
        for(int i = 2; i <= n; i++) {
            if(!arr[i]) {
                for(int j = i * 2; j <= n; j+=i) {
                    arr[j] = true;
                }
            }
        }
        
        for(int i = 2; i <= n; i++) {
            if(!arr[i]) {
                answer++;
            }
        }
        
        return answer;
    }
}