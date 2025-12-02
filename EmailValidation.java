import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter email: ");
            String email = sc.nextLine();

            if (!email.contains("@")) {
                throw new InvalidEmailException("Invalid email! '@' symbol missing.");
            }

            System.out.println("Email is valid.");

        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
