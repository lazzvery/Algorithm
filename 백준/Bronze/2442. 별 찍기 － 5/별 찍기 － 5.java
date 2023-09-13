import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int row = Integer.parseInt(br.readLine());

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row + i; j++) {
                if(j < row - 1 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}