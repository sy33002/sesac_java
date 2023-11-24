package _05_class;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Student std1 = new Student("김새싹", 1, 202020);
        Student std2 = new Student("박지은", 1, 202020);
        Student std3 = new Student("이은지", 1, 202020);
        students.add(std1);
        students.add(std2);
        students.add(std3);
        for (Student student: students) {
            student.displayInfo();
            Student.totalStudents += 1;
        }
        System.out.printf("총 학생 수는 %d명 입니다.\n", Student.totalStudents);
    }
}
