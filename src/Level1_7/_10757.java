package Level1_7;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        A = A.add(B);

        System.out.println(A.toString());
    }
}
