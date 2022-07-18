package Level1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1712 {
    public static void main(String[] args) throws IOException {
//        1000 70 170
//        연 1000 만원 10대를 팔면 700 만원 총 1700
//        10대를 팔게되면 1700만원이으로 그 11대부터 이익이 생김!
//        불변비용/(판매가 - 가변비용) = n개
//        A/(C-B) + 1 > 0
//        C<=B 인경우 이익이 발생하지 않음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if (C <= B) {
            System.out.println("-1");
        }
        else {
            System.out.println((A/(C-B))+1);
        }
    }
}
