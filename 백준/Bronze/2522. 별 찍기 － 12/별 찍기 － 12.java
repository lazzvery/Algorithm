import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < 2 * num - 1; i++) {
            for(int j = 0; j < num; j++) {
                if(i <= (2 * num - 1) / 2) {
                    if(num - i - 1 > j) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if(i - num >= j) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

    }
}