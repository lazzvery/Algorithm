import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 11047번 동전 0
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int type = Integer.parseInt(st.nextToken());
        int price = Integer.parseInt(st.nextToken());

        int[] arr = new int[type];

        for(int i = 0; i < type; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        for(int i = type - 1; i >= 0; i--) {
            if(arr[i] <= price) {
                count += price / arr[i];
                price = price % arr[i];
            }
        }

        System.out.println(count);
    }
}