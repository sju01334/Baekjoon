package Level1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;

        for(byte value : br.readLine().getBytes()){
            sum += (value - 48);
        }

        System.out.println(sum);


    }
}
