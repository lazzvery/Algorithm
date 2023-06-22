import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int delivery = Integer.parseInt(br.readLine());
        int count = 0;

        while(delivery % 5 != 0) {
            delivery -= 3;
            count++;
            if(delivery < 0) count = -1;
        }

        while(delivery != 0 && count != -1) {
            delivery -= 5;
            count++;
        }

        System.out.println(count);

    }
}