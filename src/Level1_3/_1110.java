package Level1_3;

import java.util.Scanner;

public class _1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp = num;
        int count = 0;

        do {
            int left = temp/10;
            int right = temp%10;
            temp = ((left+right) % 10) + right*10;
            count++;

        } while (num != temp);
        System.out.println(count);

    }
}
