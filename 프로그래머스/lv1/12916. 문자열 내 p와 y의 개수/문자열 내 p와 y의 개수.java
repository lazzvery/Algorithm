class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pNum = 0;
        int yNum = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if("p".equals(s.substring(i, i + 1).toLowerCase())) {
                pNum++;
            } else if("y".equals(s.substring(i, i + 1).toLowerCase())) {
                yNum++;
            }
        }

        return pNum == yNum ? true : false;
    }
}