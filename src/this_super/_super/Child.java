package this_super._super;

public class Child extends Parent {

//    Gọi đến contructor của lớp cha gần nhất
    public Child(String website) {
        super(website);
    }

//    Gọi đến biến của lớp cha gần nhất
    public void printParent() {
        System.out.println("Short link: " + super.website);
        System.out.println("Subject " + subject);
    }

    public void printChild1() {
        print();
    }

//    Gọi đến phương thức của lớp cha
    public void printChild2() {
        super.print();
        welcome();
    }

    public void print() {
        System.out.println("Subject = OOP");
    }

    public static void main(String[] args) {
        Child child = new Child("gpcoder.com");
        child.printChild1();
        System.out.println("---");
        child.printChild2();
        System.out.println("---");
        child.printParent();
    }
}
