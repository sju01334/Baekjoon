package Level1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9092 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int k=0 ; k<N; k++){
            int num = Integer.parseInt(br.readLine());
            int a = num/2;
            int b = num/2;

            while(true){
                if(isPrime(a) && isPrime(b)){
                    sb.append(a).append(" ").append(b).append("\n");
                    break;
                }
                a--;
                b++;
            }

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
