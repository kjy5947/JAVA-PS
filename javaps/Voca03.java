package javaps;

import java.util.Scanner;

public class Voca03 {

    public String solution(String str){
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
//            System.out.println(x);
            if(len > m){
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Voca03 T = new Voca03();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
//it is time to study