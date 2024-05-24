import inheritance.Accountant;
import inheritance.Employee;
import inheritance.FeProgrammer;
import inheritance.Programmer;

public class Main {
    public static void main(String[] args) {
//        Single Inheritance
        Programmer programmer = new Programmer();
        programmer.payRoll();
//        Mutilevel Inheritance (Ke thua nhieu cap)
        FeProgrammer feProgrammer = new FeProgrammer();
        feProgrammer.payRoll();
        feProgrammer.coding();
        feProgrammer.slice();
//        Hierarchical Inheritance (Ke thua da bac)
        Accountant accountant = new Accountant();
//        System.out.println(accountant.clothes = "Mac tu do"); có thể kế thừa nhưng không thể thay đối giá trị vì clothes là biến final
        System.out.println(accountant.clothes);
        System.out.println(accountant.clothes1 = "mac tu do"); /*ví dụ về không sử dụng final*/
        accountant.payRoll();
        accountant.calculate();
        accountant.timeKeeping(); /*tương tự clothes, có thể kế thừa nhưng không thể ghi đè phương thức*/
//        Polymorphism
        System.out.println("-----Polymorphism-----");
        Employee employee = new Programmer();
        Employee employee1 = new Accountant();
        Employee employee2 = new FeProgrammer();
        employee1.payRoll();
        employee2.payRoll();
        employee.payRoll();

    }
}