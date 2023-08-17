class Solution {
    boolean solution(String s) {
        char arr[] = s.toCharArray();
        int num = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(arr[i] == '(') {
                num += 1;
            } else if(arr[i] == ')') {
                if(num == 0) return false;
                num -= 1;
            }
        }
        
        if(num == 0) return true;
        else return false;
    }
}