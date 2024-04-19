import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Login page!");
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (isValid(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
        
        scanner.close();
    }
    
    private static boolean isValid(String username, String password) {
        // Replace with actual validation logic
        return username.equals("admin") && password.equals("password");
    }
}
