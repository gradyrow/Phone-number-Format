/*
Grayden Rowedder
CSC161 Computer Science II
February 1, 2021
(Lab 1)
*/
import java.util.Scanner;
public class PhoneFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input valid phone number");
        String num = input.nextLine();
        if(num.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) {
            System.out.println("Valid Phone Number"); }
        else{
            System.out.println("Bad Format for Phone number"); }
    }
}
