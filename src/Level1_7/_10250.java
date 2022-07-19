package Level1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N ; i++){
            st= new StringTokenizer(br.readLine(), " ");
            int floor = Integer.parseInt(st.nextToken());
            int room = Integer.parseInt(st.nextToken());
            int client = Integer.parseInt(st.nextToken());

            int cnt = 0;
            for(int j =0; j<room; j++){
                for(int k=0; k<floor; k++){
                    cnt++;
                    if(cnt == client){
                        if(j+1<10){
                            System.out.println(String.valueOf(k+1)+'0'+String.valueOf(j+1));
                        }else{
                            System.out.println(String.valueOf(k+1)+String.valueOf(j+1));

                        }
                        break;
                    }
                }
            }

        }
    }
}
