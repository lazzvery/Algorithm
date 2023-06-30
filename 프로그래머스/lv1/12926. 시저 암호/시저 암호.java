class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char arr[] = s.toCharArray();
        
        for(int i = 0; i < arr.length; i++) {
            if(65 <= arr[i] && 90 >= arr[i]) {
                // 대문자일 때
                arr[i] = (char) (arr[i] + n > 90 ? arr[i] + n - 26 : arr[i] + n);
            } else if(97 <= arr[i] && 122 >= arr[i]) {
                // 소문자일 때
                arr[i] = (char) (arr[i] + n > 122 ? arr[i] + n - 26 : arr[i] + n);
            }
        }
        
        answer = String.valueOf(arr);
        
        return answer;
    }
}