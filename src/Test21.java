// 알고리즘 : 11021번.

import java.util.Scanner;

public class Test21 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("첫 번째 테스트 케이스를 입력해주세요");

        // 반복문을 몇 번 수행할 지 정할 변수 선언
        int a = s1.nextInt();

        // 결과 값을 출력해줄 변수 선언
        int b ;
        int c ;

        // 반복문 실행
        for(int i = 0; i < a; i++){
            b = s1.nextInt();
            c = s1.nextInt();
            System.out.println("Case" + " " + "#" +  (i+1) + ":" +(b + c));
        }
    }
}

