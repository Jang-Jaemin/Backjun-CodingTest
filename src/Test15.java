// 백준 반복문 2739
import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        for(int i=1; i<=9; i++){ // 1 부터 9 까지의 구구단이고 i는 9를 넘어서는 안된다.
            System.out.println(a+" * "+ i + " = " + (a*i)); // a "x" i "=" a * i
        }
    }
}
