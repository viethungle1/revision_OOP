package abstraction;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw " + super.getColor() + " rectangle");
    }
}
