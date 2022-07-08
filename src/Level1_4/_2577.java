package Level1_4;

import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String result = Integer.toString(a*b*c);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < result.length(); j++) {
                if ((result.charAt(j) - '0') == i) {
                    count++;
                }
            }
            System.out.println(count);
        }


    }
}
