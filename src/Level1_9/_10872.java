package Level1_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int sum = factorial(num);

        System.out.println(sum);


    }

    public static int factorial(int num){
        if(num <= 1) return 1;
        return num * factorial(num-1);
    }

}
