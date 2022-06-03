//백준 11654번 ( 문자열 )

import java.util.Scanner;

public class Test38 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        //Scanner 에는 문자를 받으려면 nextLine() 이나 next() 를 통해 문자열로
        // 입력받아서 charAt() 으로 문자로 잘라내준다.

           int a = s1.next().charAt(0);
           System.out.print(a);
    }
}

