class Solution {
    public double solution(int[] arr) {
        double add = 0;
        
        for(int i : arr) {
            add += i;
        }
        
        double answer = add / arr.length;
        
        return answer;
    }
}