import java.util.*;

class Solution {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(!stack.isEmpty() && stack.peek() == arr[i]) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        
        if(stack.size() == 0) return 1;
        return 0;
    }
}