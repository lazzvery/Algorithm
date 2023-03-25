class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int pNum = 0;
        int yNum = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'p') {
                pNum++;
            } else if(s.charAt(i) == 'y') {
                yNum++;
            }
        }

        return pNum == yNum ? true : false;
    }
}