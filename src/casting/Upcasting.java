package casting;

import inheritance.Employee;
import inheritance.Programmer;

public class Upcasting {
    public static void main(String[] args) {
//        Upcasting: gàn đối tượng thuộc lớp con cho đối tượng thuộc lớp cha
        Programmer p = new Programmer();
        p.payRoll();
        p.coding();

        Employee e = p;/*chuyển kiểu không tường minh*/
        Employee e2 = (Employee) e;/*chuyển kiểu tường minh*/
        e.payRoll();
        e2.payRoll();
//        e.Codding(); không thể gọi phương thức codding
    }
}
