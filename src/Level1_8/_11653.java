package Level1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11653 {
//    소인수분해
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i=2; i<=Math.sqrt(num); i++){
            while(num%i == 0){
                System.out.println(i);
                num/=i;
            }
        }

        if(num!=1) System.out.println(num);

    }
}
