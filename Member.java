package inheritancedemo;
import java.util.Scanner;

public class Member {
    public String welcome = "Welcome to ABC Fintess";
    protected double annualFee;
    private String name;
    private int memberID;
    private int memberSince;
    private int discount;

    public Member() {
        System.out.println("Parent Constructor with no parameter");
    }

    public Member(String pName, int pMemberID, int pMemberSince) {
        System.out.println("Parent Constructor with 3 parameters");
        name = pName;
        memberID = pMemberID;
        memberSince = pMemberSince;
    }

    public double getDiscount() {

        return discount;
    }

    public void setDiscount() {

        Scanner input = new Scanner(System.in);
        String password;
        System.out.println("Please enter the admin password: ");
        password = input.nextLine();

        if (!password.equals("abcd")) {
            System.out.println("Invalid password. You do not have authority to edit the discount.");
        } else {
            System.out.println("Please enter the discount: ");
            discount = input.nextInt();
        }
    }

    

}