package lecture23StaticKeywordSwitchStatement;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month");
        String month = sc.next();
        switch (month) {
            case "January" :
                System.out.println("Cold!");
                break;
            case "February":
                System.out.println("Spring will be here soon!");
                break;
            case "March":
                System.out.println("ToDo: throw Christmas tree");
                break;
            default:
                System.out.println("The month is " + month);
                break;
        }
        System.out.println("Done");

    }
}
