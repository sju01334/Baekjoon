package Level1_2;

import java.util.Scanner;

public class _2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = b + c;
        if(min >= 60){
            a = a + min/60;
            if(a >= 24){
                a = a%24;
            }
            min = min%60;
        }
        System.out.println(a + " " + min);

    }
}
