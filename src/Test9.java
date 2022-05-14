// 백준 코테 : 10430번.

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        // 프로그래밍에서 나머지는 % 로 나타낸다.
        // ex) 17 % 3 = 2
        int A = s1.nextInt();
        int B = s1.nextInt();
        int C = s1.nextInt();

        System.out.println((A+B)%C);
        System.out.println((A % C + B % C) % C);
        System.out.println((A * B) % C);
        System.out.println((A % C * B % C) % C);


    }
}
