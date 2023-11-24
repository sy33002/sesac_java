package _01_basic_syntax;

public class Operater {
    public static void main(String[] args) {
        int x, y;
        double a, b;
        // 대입 연산자 ( = )
        x = 10;
        y = 20;
        a = 5.0;
        b = 10.0;

        // 산술 연산자: 숫자형 데이터에 대해서 산술 연산 가능
        System.out.println("=== x , y ===");
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(y / x);
        System.out.println(x % y);

        System.out.println("=== a, b ===");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("=== 증감 연산자 ===");
        System.out.println(x);
        System.out.println(x++ + " -> " + x);
        System.out.println(++x);
        System.out.println(y);
        System.out.println(y-- + " -> " + y);
        System.out.println(--y);

        // 산술적인 대입 연산자
        System.out.println("=== 산술적인 대입 연산자 ===");
        System.out.println(x);
        System.out.println(x += 5);
        System.out.println(x -= 5);
        System.out.println(x *= 5);
        System.out.println(x /= 5);
        System.out.println(x %= 5);

        // 비교 연산자
        System.out.println("=== 비교 연산자 ===");
        System.out.println(a);
        System.out.println(b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a == b);

        // 논리 연산자
        boolean j = true;
        boolean k = false;
        boolean l = true;
        System.out.println("=== 논리 연산자 ===");
        System.out.println(j && k); // AND: 모두 참이어야 참
        System.out.println(j && l);
        System.out.println(j || l); // OR: 둘 중 하나라도 참이면
        System.out.println(!j);

        // 삼항 연산자
        System.out.println("=== 삼항 연산자 ===");
        System.out.println(x > y ? "x는 y보다 큼" : "x는 y보다 크지 않음");
    }
}
