// 백준 1330 번.


import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        // 두 정수 a,b 설정
        int a = s1.nextInt();
        int b = s1.nextInt();

        // if else 문
        if (a > b){ // 조건 1 : a가 b보다 클경우 > 출력.
            System.out.println(">");
        }else if (a<b) { // 조건 2 a가 b보다 작을경우 < 출력.
            System.out.println("<");
        }else{ //a와 b가 같다면 ==가 출력.
            System.out.println("==");
        }
    }
}
