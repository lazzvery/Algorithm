import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int answer = 0;
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < num; i++) {
            int n = Integer.parseInt(st.nextToken());

            if(n == 1) continue;

            for(int j = 2; j <= n; j++) {
                if(j == n) {
                    answer++;
                }

                if(n % j == 0) {
                    break;
                }
            }
        }

        System.out.println(answer);

    }
}