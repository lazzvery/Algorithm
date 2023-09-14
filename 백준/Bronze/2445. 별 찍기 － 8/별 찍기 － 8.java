import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int num = 2 * Integer.parseInt(br.readLine());

        for(int i = 0; i < num - 1; i++) {
            for(int j = 0; j < num; j++) {
                if(i < num / 2) {
                    if(j > i && j < num - 1 - i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if(j <= i && j >= num - 1 - i) {
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