//백준 2438번

import java.util.Scanner;

public class Test23 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();

        for(int i = 1; i <= a; i++) { // a까지
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // println을 없애야 트리 모양 나온다 주의 !!
            }
            System.out.println();
        }
    }
}
