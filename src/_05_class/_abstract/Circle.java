package _05_class._abstract;

// 구체적인 클래스 - 도형 (원)
public class Circle extends Shape {

    int radius;
    public Circle(String color, String type, int radius) {
        super(color, type); // 부모 생성자 호출
        this.radius = radius;
    }
    double calculateArea() {
        return (radius * radius * 3.14);
    }
}
