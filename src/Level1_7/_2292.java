package Level1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2292 {
//    1 -> 7 -> 19 -> 37
//     6차이 , 12차이 , 18차이  => 6n 씩 차이가 난다
//    1 => 1
//    2~7 => 2
//    8~19 => 3 번

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int range = 2;
        int cnt = 1;

        if(num == 1){
            System.out.println(1);
        }else {
            while(num >= range){
                range = range + 6*cnt;
                cnt++;
            }
            System.out.println(cnt);
        }


    }
}
