package Level1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            int flo = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            int[][] arr = new int[flo+1][room];

            for(int j =0; j<=flo; j++){
                int sum = 0;
                for(int k=0; k<room; k++){
                    if(j == 0){
                        arr[j][k] = k+1;
                    }else{
                        sum += arr[j-1][k];
                        arr[j][k] = sum;
                    }
                }
            }
            sb.append(arr[flo][room - 1]).append("\n");

        }

        System.out.println(sb);

    }
}
