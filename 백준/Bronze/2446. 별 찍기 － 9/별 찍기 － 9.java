import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < 2 * num - 1 - i; j++) {
                if(j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for(int i = 0; i < num - 1; i++) {
            for(int j = 0; j < num + 1 + i; j++) {
                if(num - i - 2 > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}