package this_super._this;

public class UsingThisExample {
    private int id;
    private String website;
    private String subject;

    public UsingThisExample() {
    }

    public UsingThisExample(String website, String subject) {
//        Tham chiếu tới biến của lớp hiện tại
//        Từ khóa this còn có tác dụng sử lý vấn đề khi thuộc tính và tên biến giống nhau
//        VD: this.website = website
        this.website = website;
        this.subject = subject;
    }

//    This gọi đến contructor của lớp hiện tại
    public UsingThisExample(String website ) {
        this();
        this.website = website ;
    }

//    Trả về instance của lớp hiện tại
    public UsingThisExample setSubject(String subject) {
        this.subject = subject;
        return this;
    }

//    This gọi đến phương thức của lớp hiện tại
    public void print() {
        System.out.println("Id = " + id);
        this.printWebsite();
        printSubject();
    }

    private void printWebsite() {
        System.out.println("Subject = " + subject);
    }

    private void printSubject() {
        System.out.println("Website = " + website);
    }

    public static void main(String[] args) {
        UsingThisExample ex1 = new UsingThisExample("gpcoder.com", "OOP");
        ex1.print();
        System.out.println(ex1.setSubject("Java"));
    }
}
