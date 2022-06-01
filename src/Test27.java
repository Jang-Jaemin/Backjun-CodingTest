// 백준 알고리즘 : 10951번

import java.util.Scanner;

public class Test27 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        //hasNexint는 입력값이 정수이다면 true 반환, 정수가 아닐 경우에는 예외를 발생시키고 false
        //를 반환하며 반복문이 종료된다.
        while (s1.hasNextInt()){
            int a,b;
            a = s1.nextInt();
            b = s1.nextInt();

            System.out.println(a+b);
        }
        s1.close();
    }
}
