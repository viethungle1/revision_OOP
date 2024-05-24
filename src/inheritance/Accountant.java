package inheritance;

public class Accountant extends Employee {
    public void calculate() {
        System.out.println("Ngoi nhap hoa don");
    }

    @Override
    public void payRoll() {
        System.out.println("Tinh luong cho ke toan");
    }

    public void accountantMethod() {
        System.out.println("Ke toan lam viec");
    }

}
