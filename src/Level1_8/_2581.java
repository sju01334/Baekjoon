package Level1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _2581 {
    public static void main(String[] args) throws IOException {
//        범위내의 소수판별 + 합 + 최소값 구하기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 10001;

        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i=a; i<=b; i++){
            if(isPrime(i)){
                arr.add(i);
                sum+= i;
            }
        }

        if(arr.size() == 0){
            System.out.println("-1");
        }else{
            for(int num : arr){
                if(num<min){
                    min = num;
                }
            }

            System.out.println(sum);
            System.out.println(min);
        }








    }

    public static boolean isPrime(int num){
        if(num == 1) return false;

        for(int i=2; i<=Math.sqrt(num); i++){
            if(num% i ==0) return false;
        }
        return true;
    }
}
