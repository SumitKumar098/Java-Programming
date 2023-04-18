import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1 = scan.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2 = scan.nextInt();
        int sum = num1 + num2;
        System.out.println("num1 = " + num1 + " and " + " num2 = " + num2 + " gives= " + sum);
        System.out.println("Enter your name");
        String input = scan.next();
        System.out.println(input.toUpperCase());

        String name="Sumit Kumar";
        System.out.println(name.contains("mar"));
        System.out.println(name.endsWith("umit"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("um"));
    }
}
