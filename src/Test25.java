// 백준 알고리즘 : 10871번

import java.util.Scanner;

public class Test25 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int a = s1.nextInt();
        int b = s1.nextInt();

        for(int i=0; i<a; i++){
            int c = s1.nextInt();
            if (c < b){
                System.out.println(c + " ");
            }
        }

    }
}

