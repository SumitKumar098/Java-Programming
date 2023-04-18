import java.util.Scanner;

public class Calculator {
    static void cal() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number 1 &number 2:");
            Float num1 = scan.nextFloat();
            Float num2 = scan.nextFloat();
            System.out.println("1.ADD\n" + "2.SUB\n" + "3.MULTI\n" + "4.DIV\n" + "5.EXIT");
            System.out.println("Enter your choice:");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Wrong choice:");
            }

        }
    }

    public static void main(String[] args) {
        cal();
    }
}
