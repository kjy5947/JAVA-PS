package javaps;

import java.util.Scanner;

public class Voca03_2 {

    public String solution(String str){

        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while((pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }//while
        if(str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {

        Voca03_2 T2 = new Voca03_2();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T2.solution(str));
    }
}
// it is my study
