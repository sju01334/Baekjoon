package Level1_6;

import java.io.*;

public class _1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        s = s.trim();
        if(s.isEmpty()) {
            System.out.println(0);
        }else {
            String[] str = s.split(" ");
            System.out.println(str.length);
        }
    }
    
}
