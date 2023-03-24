class Solution {
    public double solution(int[] arr) {
        int add = 0;
        
        for(int i : arr) {
            add += i;        
        }
        
        double answer = (double) add / arr.length;
        return answer;
    }
}