package objOriented;

public class Rectangle {
    int height;
    int width;

    public int calculateArea(int width, int height) {
        return width * height;
    }

    public int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    public boolean isSquare(int width, int height) {
        return width == height;
    }
}
