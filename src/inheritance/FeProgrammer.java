package inheritance;

public class FeProgrammer extends Programmer {
    public void slice() {
        System.out.println("Nhan vien ngoi cat giao dien");
    }

    @Override
    public void coding() {
        System.out.println("Nhan vien ngoi code HTML, CSS");
    }

    @Override
    public void payRoll() {
        System.out.println("Tinh luong cho nhan vien FE");
    }
}
