class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int cnt = t.length() - p.length() + 1;
        
        for(int i = 0; i < cnt; i++) {
            if(Long.parseLong(p) >= Long.parseLong(t.substring(i, i + p.length()))) answer++;
        }
        
        return answer;
    }
}