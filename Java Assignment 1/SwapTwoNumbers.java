import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        // Swap using a temporary variable
        
        num1 = num1 + num2; // num1 now holds the sum of num1 and num2
        num2 = num1 - num2; // num2 now holds the original value of num1
        num1 = num1 - num2; // num1 now holds the original value of num2
        
        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        
        sc.close();
    }
}
