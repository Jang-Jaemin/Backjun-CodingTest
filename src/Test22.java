import java.util.Scanner;
public class Test22{
    public static void main(String args[]) {
        Scanner s1 = new Scanner(System.in);
        //값을 입력 받아서 int형 변수 n에 값을 저장한다.
        int n = s1.nextInt();

        //int형 변수 a,b,c를 선언한다.
        int a,b,c;

        //for 반복문 선언한다.
        for(int i=1; i<=n; i++){
            a = s1.nextInt();// 값을 입력받아 변수 a에 저장한다.
            b = s1.nextInt();// 값을 입력받아 변수 b에 저장한다.
            c = a+b; // a+b한 값을 변수 c에 저장한다.
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+c);
        }
    }
}