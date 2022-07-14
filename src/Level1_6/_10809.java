package Level1_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        String s = br.readLine();

        for(int i=0; i<s.length(); i++){
            int ch = s.charAt(i);
            if(arr[ch - 97] == -1){
                arr[ch - 97] = i;
            }
        }

        for(int val : arr){
            System.out.print(val + " ");
        }


    }
}
