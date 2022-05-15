//백준 코테 : 2753번.

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        // 조건 1. 4로 나누어지는 년도.
        // 2. 4로 떨어져도 100으로 나누어 떨어지면 평년
        // 3. 4로 나누어 떨어지고, 100으로 나누어 떨어지나, 400으로 떨어지면 윤년.

        if ( a % 4 == 0){ // 만약 4의 배수일 경우.
            if(a % 400 == 0 ) // 4의 배수이면서 400의 배수일 경우
                System.out.println("1");
            else if(a % 100 == 0) // 4의 배수이면서 100의 배수일 경우
                System.out.println("0");
            else System.out.println("1"); // else부분들의 마무리
            }
            else System.out.println("0"); // if 문 마무리 하는 코드.
    }
}
