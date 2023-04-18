import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        switch (age) {

            case 12:
                System.out.println("You are in adolecence");
                break;

            case 18:
                System.out.println("You are and adult");
                break;

            case 45:
                System.out.println("You are an middle age man");
                break;

            case 80:
                System.out.println("You are an old man");
                break;

            default:
                System.out.println("You are not a man");

        }
    }
}
