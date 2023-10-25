import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    완전탐색 문제 2. 2017 연세대학교 프로그래밍 경시대회 (#14568)
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int candy = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0; i <= candy; i++) {
            for(int j = 0; j <= candy; j++) {
                for(int k = 0; k <= candy; k++) {

                    if(i + j + k == candy) {
                        if(i >= j + 2) {
                            if(i != 0 && j != 0 && k != 0) {
                                if(k % 2 == 0) {
                                    answer++;
                                }
                            }
                        }
                    }

                }
            }
        }

        System.out.println(answer);
    }
}