class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        
        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        
        System.out.println(sum);
        System.out.println(num);
        
        if(x % sum != 0) {
            return false;
        } else {
            return true;
        }
        
    }
}