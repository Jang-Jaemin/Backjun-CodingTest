//2439번

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();

        /*
        1. 1 행부터 a 행까지 출력을 하기 위한 가장 큰 틀의 반복문을 먼저 구상.
        2. a 번째 행에는 a-i개의 공백이 출력되고, 별은 n 번째 행에 i 개가 출력되어야 한다.
           그러면 i 가 행을 의미하니 a-i 의 값 만큼 공백을 출력해주어야 겠다.
        */
        for(int i = 0; i < a; i++) {
            for (int j = 0; j < a-i; j++) {
                System.out.print(" "); // println을 없애야 트리 모양 나온다 주의 !!
            }
            for(int k=0; k < i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
       // System.out.println();
    }
}
