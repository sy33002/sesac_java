package _05_class;

import java.util.Scanner;

public class CircleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요: ");
        int r = sc.nextInt();
        System.out.printf("원의 반지름: %f\n", (double)r);
        System.out.printf("원의 넓이: %f\n", Circle.calculagteArea(r));
    }
}
