//백준 코테 : 9498번 문제

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();

        if(a>=90) System.out.println("A"); //만약 a가 90점보다 크거나 같을때, => 90~100
        else if(a>=80) System.out.println("B");// 만약 a가 80점보다 크거나 같을떄, => 80~89
        else if(a>=70) System.out.println("C");// 만약 a가 70점보다 크거나 같을때, => 70~79
        else if(a>=60) System.out.println("D");// 만약 a가 60점보다 크거나 같을때, => 60~69
        else System.out.println("F"); // 만약 a가 60점보다 아래 일때는 F. 59~0..
    }
}
