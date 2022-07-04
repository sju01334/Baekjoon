package Level1_2;

import java.util.Scanner;

public class _2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        int realM = M-45;
        if(realM < 0){
            if(H != 0){
                H = H - 1;
            }else{
                H = 23;
            }
            realM = 60 + realM;
        }
        System.out.println(H + " " + realM);

    }
}
