package Level1_4;

import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = new int[9];

        for(int i = 0 ; i < arr.length ; i ++)
        {
            arr[i]=sc.nextInt();
        }

        int max = arr[0];
        int index = 0 ;

        for(int i = 1 ; i < arr.length ; i ++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                index = (i);
            }
        }

        System.out.println(max);
        System.out.println(index+1);

    }
}
