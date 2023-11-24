package _02_control_statement;

public class MethodOverloading {
    public static void main(String[] args) {
        // 1. 객체 생성
        MethodOverloading ol = new MethodOverloading();

        // 2. 객체 메소드 사용
        System.out.println(ol.add(1,2));
        System.out.println(ol.add(1.383,2.53));
        System.out.println(ol.add(1,2, 3));
    }

    public int add (int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add (int a, int b, int c) {
        return a + b + c;
    }
}
