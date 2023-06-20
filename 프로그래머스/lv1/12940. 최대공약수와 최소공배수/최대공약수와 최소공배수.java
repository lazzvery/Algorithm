class Solution {
    public int[] solution(int n, int m) {
        int gcd = 1;
        int min = n > m ? m : n;
        
        for(int i = 1; i <= min; ++i) {
           if(n % i == 0 && m % i == 0) {
               gcd = i;
           }
        }
        
        int icm = gcd * (n / gcd) * (m / gcd);
        
        int[] answer = {gcd, icm};
        
        return answer;
    }
}