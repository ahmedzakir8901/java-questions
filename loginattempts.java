import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "12345";

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (username.equals(correctUsername) &&
                password.equals(correctPassword)) {

                System.out.println("Login Successful");
                break;

            } else {

                System.out.println("Invalid Credentials");

                if (attempt < 3) {
                    System.out.println("Attempts Left: " + (3 - attempt));
                } else {
                    System.out.println("Account Locked");
                }

            }

        }

        sc.close();
    }
}
