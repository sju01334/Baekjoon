package Level1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            int a = Integer.parseInt(br.readLine());
            if(a == 0) break;

            int b = 2*a;
            int cnt = 0;

            for(int i=a+1; i<=b; i++){
                if(isPrime(i)) cnt++;
            }

            sb.append(cnt).append("\n");

        }

        System.out.println(sb);


    }

    public static boolean isPrime(int num){

        if(num == 1) return false;

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }

        return true;
    }
}
