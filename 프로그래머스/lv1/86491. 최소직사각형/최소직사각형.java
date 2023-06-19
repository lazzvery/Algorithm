import java.lang.*;
import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
        for(int[] i : sizes) {
            Arrays.sort(i);
        }
        
        for(int i = 0; i < sizes.length; i++) {
            width = Math.max(width, sizes[i][0]);
            height = Math.max(height, sizes[i][1]);
        }
        
        return width * height;
    }
}