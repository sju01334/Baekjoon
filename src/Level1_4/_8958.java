package Level1_4;

import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[sc.nextInt()];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.next();
        }

        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            int sum = 0;

            for(int k=0; k<arr[i].length(); k++){
                if(arr[i].charAt(k) == 'O'){
                    cnt++;
                }
                else{
                    cnt = 0;
                }
                sum+= cnt;
            }
            System.out.println(sum);
        }
    }
}
