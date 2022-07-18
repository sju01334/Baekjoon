package Level1_6;

import java.io.*;

public class _1316 {
    public static void main(String[] args) throws IOException {
//        연속한 단어는 괜찮지만 나타났다가 다시 나타나는 단어는 카운트 하지 않음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int s = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=0; i<s; i++){
            String str = br.readLine();

            boolean[] check = new boolean[26];
            boolean flag = true; // 그룹단어인지 아닌지 체크

            for(int k=0; k<str.length(); k++){
                int bool = str.charAt(k) - 'a';
                if(check[bool]){ //쓴적 있는단어다??
                    if(str.charAt(k) != str.charAt(k-1)){//근데 전에 단어랑 다르다??
                        //그럼 연속된 단어가 아닙니다...
                        flag = false; //그룹단어 아님표시!
                        break;
                    }
                }else { //쓴적이 없다앗!
                    check[bool] = true;
                }
            }
            if(flag) cnt++;
        }

        System.out.println(cnt);


    }
}
