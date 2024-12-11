package objOriented;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();

        int area = rec.calculateArea(10, 10);
        int perimeter = rec.calculatePerimeter(10, 10);
        boolean square = rec.isSquare(10, 10);
        System.out.println("넓이 : " + area);
        System.out.println("둘레 길이 : " + perimeter);
        System.out.println("정사각형 여부 : " + square);

    }
}
