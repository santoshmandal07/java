import java.util.Scanner;
public class fibonacciseriesandfactorialusingrecursiveandnonrecursive {
    private static Scanner scanner = new Scanner(System.in);

    // ============ FIBONACCI SERIES METHODS ============
    
    // Recursive Fibonacci method
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    // Non-recursive Fibonacci method
    public static int fibonacciNonRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        
        int fib1 = 0, fib2 = 1, fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        return fib;
    }
    
    // Print Fibonacci series up to n terms (using non-recursive)
    public static void printFibonacciSeries(int n) {
        System.out.println("\nFibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNonRecursive(i) + " ");
        }
        System.out.println();
    }
    
    // ============ FACTORIAL METHODS ============
    
    // Recursive Factorial method
    public static int factorialRecursive(int n) {
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return -1;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    
    // Non-recursive Factorial method
    public static int factorialNonRecursive(int n) {
        if (n < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return -1;
        }
        
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    
    // ============ MAIN METHOD ============
    
    public static void main(String[] args) {
        System.out.println("\n========== FIBONACCI & FACTORIAL CALCULATOR ==========\n");
        
        // Get Fibonacci input from user
        System.out.print("Enter the number of Fibonacci terms to display: ");
        int fibonacciTerms = scanner.nextInt();
        
        System.out.println("\n====== FIBONACCI RESULTS ======");
        System.out.println("\nRecursive Method:");
        for (int i = 0; i <= fibonacciTerms; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        
        System.out.println("\n\nNon-Recursive Method:");
        for (int i = 0; i <= fibonacciTerms; i++) {
            System.out.print(fibonacciNonRecursive(i) + " ");
        }
        
        // Get Factorial input from user
        System.out.print("\n\nEnter a number to find factorial: ");
        int num = scanner.nextInt();
        
        System.out.println("\n====== FACTORIAL RESULTS ======");
        System.out.println("\nRecursive Method: " + num + "! = " + factorialRecursive(num));
        System.out.println("Non-Recursive Method: " + num + "! = " + factorialNonRecursive(num));
        
        scanner.close();
    }
}
