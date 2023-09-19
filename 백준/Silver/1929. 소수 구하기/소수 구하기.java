import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        boolean arr[] = new boolean[num2 + 1];
        arr[0] = arr[1] = true;

        for(int i = 2; i <= num2; i++) {
            if(arr[i]) continue;

            for(int j = i * 2; j <= num2; j+=i) {
                arr[j] = true;
            }
        }

        for(int i = num1; i <= num2; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }

    }
}