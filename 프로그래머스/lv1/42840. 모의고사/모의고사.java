import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] num = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
            if(arr1[i % arr1.length] == answers[i]) {
                num[0] += 1;
            }
            if(arr2[i % arr2.length] == answers[i]) {
                num[1] += 1;
            }
            if(arr3[i % arr3.length] == answers[i]) {
                num[2] += 1;
            }
        }
        
        int max = Math.max(Math.max(num[0], num[1]), num[2]);
        
        for(int i = 0; i < num.length; i++) {
            if(max == num[i]) answer.add(i + 1);
        }
        
        return answer;
    }
}