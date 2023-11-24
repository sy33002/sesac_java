package _03_array;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("5개 정수 입력");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();

        System.out.println(avg(n1,n2,n3,n4,n5));


    }
    public static double avg (int n1, int n2, int n3, int n4, int n5) {
        return (n1 + n2 + n3 + n4 + n5) / 5;
    }
}
