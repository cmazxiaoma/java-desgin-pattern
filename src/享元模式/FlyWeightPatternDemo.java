package 享元模式;

public class FlyWeightPatternDemo {
    
    private static final String colors[] = new String[] {"red", "green", "blue", "white", "black"};
    
    public static void main(String[] args) {
        
        for (int i = 0 ; i < 20 ; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getColorName());
            circle.setRadius(5);
            circle.setX(getCircleX());
            circle.setY(getCircleY());
            circle.draw();
        }
    }
    
    public static int getCircleX() {
        return (int) (Math.random() * 1000);
    }
    
    public static int getCircleY() {
        return (int) (Math.random() * 5);
    }
    
    public static String getColorName() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
