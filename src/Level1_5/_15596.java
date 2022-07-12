package Level1_5;

public class _15596 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Test t = new Test();
        System.out.println(t.sum(arr));

    }
}

class Test{
    long sum(int[] a){
        int sum = 0;
        for(int num : a){
            sum += num;
        }
        return sum;

    }
}
