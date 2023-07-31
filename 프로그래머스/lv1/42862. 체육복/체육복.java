class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = 1;
        }
        
        for(int i = 0; i < lost.length; i++) {
            arr[lost[i] - 1] -= 1;
        }
        
        for(int i = 0; i < reserve.length; i++) {
            arr[reserve[i] - 1] += 1;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                if(i - 1 >= 0 && arr[i - 1] == 2) {
                    arr[i - 1] = 1;
                    arr[i] = 1;
                } else if(i + 1 < n && arr[i + 1] == 2) {
                    arr[i + 1] = 1;
                    arr[i] = 1;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) answer++;
        }
        
        return answer;
    }
}