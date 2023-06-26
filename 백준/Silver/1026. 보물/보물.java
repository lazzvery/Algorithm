import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int[] arr = new int[num];
        int[] arr2 = new int[num];

        for(int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        int answer = 0;

        for(int i = 0; i < num; i++) {
            answer += (arr[i] * arr2[num - i - 1]);
        }

        System.out.println(answer);

    }
}