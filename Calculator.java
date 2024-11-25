package LB7;

public class Calculator {
    private static final int MAX_SHAPES = 10;
    private AbstractShape[] shapes = new AbstractShape[MAX_SHAPES];
    private int currentShapeCount = 0;

    public void addShape(AbstractShape shape) {
        if (currentShapeCount >= MAX_SHAPES) {
            throw new ArrayIndexOutOfBoundsException("Ошибка: достигнуто максимальное количество фигур.");
        }
        shapes[currentShapeCount++] = shape;
    }

    public void showAllShapes() {
        System.out.println("Все зарегистрированные фигуры:");
        for (int i = 0; i < currentShapeCount; i++) {
            System.out.println(shapes[i]);
        }
    }
}
