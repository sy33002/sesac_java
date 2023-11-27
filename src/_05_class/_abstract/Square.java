package _05_class._abstract;

// 구체적인 클래스 - 도형 (사각형)
public class Square extends Shape {
    int w ;
    int h ;
    public Square(String color, String type, int w, int h) {
        super(color, type);
        this.w = w;
        this.h = h;
    }
    double calculateArea() {
        return (w * h);
    }
}
