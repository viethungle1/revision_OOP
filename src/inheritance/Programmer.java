package inheritance;

public class Programmer extends Employee {
    public void coding() {
        System.out.println("Nhan vien ngoi code");
    }

    @Override
    public void payRoll() {
        System.out.println("Tinh luong cho lap trinh vien");
    }

    public void programmerMethod() {
        System.out.println("Lap trinh vien lam viec");
    }
}
