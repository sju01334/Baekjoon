package Level1_7;

import java.io.BufferedReader;
import java.util.Scanner;

public class _2839 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = sc.nextInt();
        int result = 0;
        int cnt = 1;

        while(true){
            if(n%5 == 3){
                result += n/5;
                result += result/3;
                break;
            }else {
                if(n < (n%5 + 5*cnt)){
                    result = -1;
                    break;
                }
                if((n%5 + 5*cnt)%3 == 0){
                    result += (n%5 + 5*cnt)/3;
                    result += (n-(n%5 + 5*cnt))/5;
                    break;
                }else{
                    cnt++;
                }
            }
        }

        System.out.println(result);
    }
}
