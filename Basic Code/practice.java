import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        x = sc.nextInt();
        
        System.out.print("Enter second number: ");
        y = sc.nextInt();
        
        sum = x + y;
        System.out.println("The sum is: " + sum);
        
        sc.close();
    }
    
}
