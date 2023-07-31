import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean arr[] = new boolean[n];
        
        for(int i = 0; i < section.length; i++) {
            arr[section[i] - 1] = true;
        }
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == true) {
                for(int j = 0; j < m; j++) {
                    if(i + j >= n) break;
                    arr[i + j] = false;
                }
                answer++;
            }
        }
        
        return answer;
    }
}