import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(stack.empty() || stack.peek() != arr[i]) {
                stack.push(arr[i]);
                cnt++;
            }
        }
        
        int[] tmp = new int[cnt];
        int[] answer = new int[cnt];
        
        for(int i = 0; i < cnt; i++) {
            tmp[i] = stack.pop();
        }
        
        for(int i = 0; i < cnt; i++) {
            answer[cnt - i - 1] = tmp[i];
        }
        
        return answer;
    }
}