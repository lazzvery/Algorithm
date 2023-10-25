import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    문제 1. 암호키 (#1816)
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++) {
            Long num = Long.parseLong(br.readLine());

            for(int j = 2; j <= 1000000; j++) {
                if(num % j == 0) {  // 100만 이하의 약수가 존재한다
                    System.out.println("NO");
                    break;
                }

                if(j == 1000000) {  // 100만 이하의 약수가 존재하지 않는다
                    System.out.println("YES");
                }
            }
        }

    }
}