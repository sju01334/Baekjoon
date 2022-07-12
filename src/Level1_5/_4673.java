package Level1_5;

public class _4673 {
    public static void main(String[] args) {

        boolean[] a = new boolean[10001];

        for(int i=1; i<10001; i++){
            int n = d(i);
            if (n < 10001) {
                a[n] = true;
            }
        }

        for (int i = 1; i < 10001; i++) {
            if (!a[i]) {
                System.out.println(i);
            }
        }
    }

    static int d(int number){
        int sum = number;
        while(number != 0){
            sum = sum + (number%10);
            number = number/10;

        }
        return sum;
    }

}
