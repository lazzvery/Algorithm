class Solution {
    public String solution(String s) {
        String answer = s.toUpperCase();
        char arr[] = answer.toCharArray();
        
        for(int i = 1; i < arr.length; i++) {
            if(65 <= arr[i - 1] && 90 >= arr[i - 1]) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        
        answer = String.valueOf(arr);
        
        return answer;
    }
}