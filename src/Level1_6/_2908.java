package Level1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1;
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            int hun = a/100;
            int ten = (a/10)%10 *10;
            int one = a%10*100;
            int num = hun+ten+one;
            if(num > max){
                max = num;
            }

        }
        System.out.println(max);



    }
}
