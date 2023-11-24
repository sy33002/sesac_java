package _05_class;
import javax.crypto.spec.RC2ParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Rectangle> rects = new ArrayList<>();

        int w = sc.nextInt();
        int h = sc.nextInt();
        rects.add(new Rectangle(w,h));
        while (w != 0 && h != 0) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            w = sc.nextInt();
            h = sc.nextInt();
            rects.add(new Rectangle(w,h));
        }
        for (Rectangle rect: rects) {
            System.out.print(rect.toString());
        }
        System.out.printf("Rectangle 인스턴스의 개수는: %d\n", rects.size());
    }
}
