package Level1_4;


import java.util.*;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[sc.nextInt()];

        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.nextDouble();
        }
        double sum = 0;
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            sum += ((arr[i] / arr[arr.length-1])) * 100;
        }
        System.out.println(sum / arr.length);
    }
}
