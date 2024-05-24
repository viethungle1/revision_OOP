package this_super._super;

public class Parent {

    public String website = "gpcoder.com";
    public String subject = "OOP";

    public Parent(String website) {
        this.website = website;
    }

    public void print() {
        System.out.println("Website = " + website);
    }

    public void welcome() {
        System.out.println("Welcome to gpcoder.com");
    }
}
