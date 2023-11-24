package _01_basic_syntax;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("나이 입력하세요");
        String age = sc.next();
        System.out.println("안녕하세요!" + name + "님 (" + age + "세)");
    }
}
