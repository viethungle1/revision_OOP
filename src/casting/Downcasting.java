package casting;

import inheritance.Accountant;
import inheritance.Employee;
import inheritance.Programmer;

import java.util.ArrayList;
import java.util.List;

public class Downcasting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Programmer());
        employees.add(new Accountant());
        employees.add(new Employee());
        employees.add(new Programmer());
        for(Employee employee : employees) {
//            sử dụng toán tử instanceOf trong trường hợp này vì trong mảng arrayList vì không
//            biết trước kiểu cụ thể trong mảng đó
            if(employee instanceof Programmer programmer) {
                programmer.programmerMethod();
            } else if(employee instanceof Accountant accountant) {
                accountant.accountantMethod();
            } else {
                System.out.println("--");
            }
        }
    }
}
