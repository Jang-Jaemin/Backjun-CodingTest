import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        //for 문에 반복할 변수 및 합계값을 넣을 변수 선언.
        int n = s1.nextInt();
        int sum = 0;

        //반복문 실행 => i 부터 a까지 합을 구하는 반복문.
        for(int i=1; i<=n; ++i){
            sum +=i;
        }
            // 결과 출력
            System.out.println(sum);
    }
}
