package Level1_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(Fibonacci(N));
    }

    public static int Fibonacci(int num){
        if(num ==0) return 0;
        if(num ==1) return 1;

        return Fibonacci(num-1)+Fibonacci(num-2);
    }
}
