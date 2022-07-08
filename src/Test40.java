// 10809번 문제.

/*import java.util.Scanner;

public class Test40 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        // int 형 배열을 하나 생상하고, 모두 -1로 초기화 시킨다.
        int[] arr = new int[26]; // 알파벳 26자가 들어갈 배열 생성.

        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1; // 초기화용 -1이다.
        }

        String S = s1.nextLine(); // s라는 문자열 설정.

        // 반복문을 통해 문자열의 각 문자를 검사한다. charAt()라는 메소드를 사용하여 문자를 추출한뒤
        // ch 라는 변수를 저장한다.
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
                arr[ch - 'a'] = i;
            }
        }

        for(int val : arr) {	// 배열 출력
            System.out.print(val + " ");
        }
    }
}
*/