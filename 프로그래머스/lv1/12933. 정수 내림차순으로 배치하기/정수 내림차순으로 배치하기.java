import java.util.*;

class Solution {
    public Long solution(long n) {
        ArrayList<Long> arr = new ArrayList<>();
        String answer = "";
        
        while(n > 0) {
            arr.add(n % 10);
            n /= 10;
        }
        
        Collections.sort(arr, Collections.reverseOrder());
        
        for(Long i : arr) {
            answer = answer + i + "";
        }
        
        return Long.parseLong(answer);
    }
}