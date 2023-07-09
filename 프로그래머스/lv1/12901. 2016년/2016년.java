class Solution {
    public String solution(int a, int b) {
        String[] arr = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int c = 0;
        
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        if(a == 1) c = b;
        else{
            for(int i = 0; i < a - 1; ++i){
                c += month[i];
            }
            c += b;
        }
        return arr[c % 7];
    }
}