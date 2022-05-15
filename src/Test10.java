// 백준 코테 : 2588 번
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();

        //1의 자리, 10의 자리, 100의 자리 곱하는 순서를 파악하자.

        System.out.println(a * (b % 10));
        System.out.println(a * (b % 100/10));
        System.out.println(a * (b % 1000/100));
        System.out.println(a * b);
    }
}
