package _03_array;

// Collection Framework
// : 객체를 효율적으로 추가, 삭제, 검색할 수 있도록 관련 인터페이스 & 클래스를 java.util 포함시켜놓음

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// ArrayList 클래스
public class ArrayListEx {
    public static void main(String[] args) {
        // 1. ArrayList 생성 (정수형 요소를 저장하는 예제)
        List<Integer> numbers = new ArrayList<>();

        // 2. 요소 추가
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // 3. 요소 접근
        System.out.println("첫번째 요소: " + numbers.get(0));

        // 4. 요소 수정
        numbers.set(1, 77);
        System.out.println("numbers: " + numbers);

        // 5. 요소 삽입
        numbers.add(1, 7);
        System.out.println("numbers: " + numbers);

        // 6. ArrayList 끼리 연결
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(100, 99, 98)); // [100, 99, 98]
        numbers.addAll(numbers2);
        System.out.println("numbers: " + numbers);

        // 7. 요소 위치 찾기
        System.out.println(numbers.indexOf(10)); // 0
        System.out.println(numbers.indexOf(50)); // 5
        System.out.println(numbers.indexOf(88)); // -1

        // 8. 요소 삭제
        numbers.remove(2);
        System.out.println("numbers: " + numbers);

        // 9. 리스트 크기 확인
        System.out.println("numbers length : " + numbers.size());

        // 10. 모든 요소 출력 (반복문)
        for (Integer n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 11. 모든 요소 삭제
        numbers.clear();
        System.out.println("numbers : " + numbers);

        ///////////////////////////////////////////////////////////
        // Student 타입 ArrayList 생성
        List<Student> students = new ArrayList<>();

        students.add(new Student("john", 10));
        students.add(new Student("a", 11));
        students.add(new Student("b", 12));
        students.add(new Student("c", 13));

        Student std1 = students.get(0);
        System.out.println(std1);
        System.out.println(std1.getName() + " 학생의 나이는 " + std1.getAge() + "세 입니다!");

        System.out.println("=== 학생 명단 ===");
        for (Student student: students) {
            System.out.print(student.getName() + "(" + student.getAge() + ")");
        }
        System.out.println();
        students.remove(2);
        System.out.println(students);

        //////////////////////////////////////////////////////
        // 실습
        List<String> inputArray = new ArrayList<>();
        while (true) {
            System.out.println("문자를 입력해주세요. :");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            if (str.equals("exit")){
                for (String input : inputArray) {
                    System.out.println(input);
                }
                break;
            }
            inputArray.add(str);

        }

    }
}

class Student{
    private String name;
    private int age;
    //생성자
    public Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Student(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "학생 객체 {" +
                "이름= '" + name + '\'' +
                ", 나이= " + age +
                '}';
    }
}


