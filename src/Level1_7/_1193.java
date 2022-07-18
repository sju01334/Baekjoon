package Level1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int sum = 0;
        int current = 1; //대각 개수

        while(true){
            if(num <= sum + current){
                int extra = (sum+current) - num;
                int bottom = extra + 1;
                int top = current - extra;
                if(current%2 == 1){
                    System.out.println(bottom+"/"+top);
                }else{
                    System.out.println(top+"/"+bottom);
                }
                break;

            }else{
                sum += current;
                current++;
            }
        }

    }
}
