import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(stack.empty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        int size = stack.size();
        
        for(int i = 0; i < size; i++) {
            answer[size - 1 - i] = stack.pop();
        }
        
        return answer;
    }
}