import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter distance in miles: ");
        double miles = sc.nextDouble();
        
        // 1 mile = 1.609344 kilometers
        double kilometers = miles * 1.609344;
        
        System.out.println(miles + " miles = " + kilometers + " kilometers");
        
        sc.close();
    }
}
