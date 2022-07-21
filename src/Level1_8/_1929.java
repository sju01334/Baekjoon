package Level1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for(int i=a; i<=b; i++){
            if(isPrime(i)) System.out.println(i);
        }

    }

    public static boolean isPrime(int num){

        if(num == 1) return false;

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }

        return true;
    }
}
