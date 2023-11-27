package _05_class._abstract;

public class ShapeEx {
    public static void main(String[] args) {
        Circle c = new Circle("Red", "Circle", 4);
        Square s = new Square("yellow", "Square", 4, 5);

        System.out.println("=== " + c.getType() + " 도형의 정보 ===");
        System.out.println("도형의 색상: " + c.getColor());
        System.out.println("도형의 넓이: " + c.calculateArea());

        System.out.println("=== " + s.getType() + " 도형의 정보 ===");
        System.out.println("도형의 색상: " + s.getColor());
        System.out.println("도형의 넓이: " + s.calculateArea());
    }
}
