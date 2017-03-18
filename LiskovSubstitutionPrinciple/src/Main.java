
public class Main {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(15);
        rectangle.setWidth(10);
        int area = rectangle.getArea();
        System.out.println(area);

        Rectangle rectangle1 = new Square();
        rectangle1.setHeight(15);
        rectangle1.setWidth(10);
        int areas = rectangle1.getArea();
        System.out.println(areas);
    }
}
