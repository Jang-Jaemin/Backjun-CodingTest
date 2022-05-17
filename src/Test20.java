// 백준 알고리즘 : 2742번, 거꾸로 문제

import java.util.Scanner;

public class Test20 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int a = s1.nextInt();

        // i = a부터 1까지 반복문을 돌리는 것이므로 i로 출력하여도 된다.
        for(int i=a; i > 0 ; i--){
            System.out.println(i);
        }
    }
}

