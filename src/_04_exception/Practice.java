package _04_exception;

import java.sql.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[] newArray = {11, 22, 33, 44};
        for (int i = 0; i < 5; i++) {
            try{
                System.out.println(newArray[i]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("인덱스 범위를 벗어났습니다.");
            }
        }

        //실습 2
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 사이즈 입력해주세요");
        int size1;
        try{
            int sum = 0;
            size1 = sc.nextInt();
            for (int i = 1; i <= size1; i++) {
                sum += i;
            }
            System.out.println("평균값 : " + (sum / (double) size1));
        } catch (InputMismatchException e) {
            System.out.println("");
            System.exit(1);
        }

        // 실습3
        System.out.println("배열 크기를 입력해주세요");
        int size = 0;
        try {
            size = sc.nextInt();
        } catch(Exception e) {
            System.out.println("배열 크기 제대로 입력해라.");
        }
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        System.out.println("배열 입력해");
        try {
            for (int i = 0; i < size; i++) {
                int num = sc.nextInt();
                numbers.add(i, num);
            }
            System.out.println(numbers.toString());
            System.out.println("중복된 숫자 서브 배열 : ");
            int i = 0;
            while (i < size - 1) {
                int j = i + 1;
                while (j < size) {
                    if (numbers.get(i).equals(numbers.get(j))) {
                        numbers2.add(numbers.get(i));
                    }
                    j++;
                }
                i++;
            }
            System.out.println(numbers2.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("제대로 입력해라.");
        } catch (InputMismatchException e) {
            System.out.println("제대로 입력해라.");
        }


    }
}
