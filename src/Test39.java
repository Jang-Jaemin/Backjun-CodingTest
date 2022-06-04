// 11720 번 문제.

import java.util.Scanner;

public class Test39 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int a = s1.nextInt();
        String b = s1.next(); // nextInt랑 next 주의 = String은 문자열이라 int를 사용 x.

        int sum = 0;

        for(int i=0; i<a; i++){
            sum += b.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
