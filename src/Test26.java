//백준 알고리즘 : 10952번.
// while ( true ) 로 무한 반복 하면서 만약 A 와 B 가 둘 다 0 일경우 break; 를 통해
// 반복문을 종료해주고, 아닐경우 입력받은 A 와 B 를 더해준다.

import java.util.Scanner;

public class Test26 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

            while(true){ // while true로 특정 조건이 되기 전까지 계속 반복시킨디ㅏ.

                 int A = s1.nextInt(); // a 입력
                 int B = s1.nextInt(); // b 입력

                if(A==0 && B==0){ // if문으로 a와 b가 둘 다 0이면 while 문을 빠져나가게 한다.
                 s1.close();
                    break;
                }
                 System.out.println(A+B); // 16행에서 if문으로 빠져나가지 않을경우 a,b를 더해서 출력해준다.
        }
    }
}
