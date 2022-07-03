package Level1_1;

import java.util.Scanner;

public class _2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int c1 = (b % 10) * a;
        int c10 = (b % 100 / 10) * a;
        int c100 = (b / 100) * a;


        System.out.println(c1);
        System.out.println(c10);
        System.out.println(c100);
        System.out.println(a*b);

    }
}
