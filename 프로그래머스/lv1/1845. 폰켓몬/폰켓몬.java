import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            if(arr.size() >= nums.length / 2) break;
            arr.add(nums[i]);
        }
        
        return arr.size();
    }
}