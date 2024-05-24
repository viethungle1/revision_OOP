package inheritance;

public class Employee {
    static String companyName = "Microsoft";
    public final String clothes = "Dong phuc";
    public String clothes1 = "Dong phuc";

    public void payRoll() {
        System.out.println("Nhan vien duoc tinh luong");
    }
//    Overloading
    final public void timeKeeping() {
        System.out.println("Cham cong truoc 8h");
    }

    public void timeKeeping(String a) {
        System.out.println("Cham cong truoc 8h bang" + a);
    }

    public String timeKeeping(String a, String b) {
        return "Cham cong truoc 8h bang" + a;
    }
}
