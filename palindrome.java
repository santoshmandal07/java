import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int num, rev = 0, rem;
        int i;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        i = num;
        while (i != 0) {
            rem = i % 10;
            rev = rev * 10 + rem;
            i = i / 10;
        }
        if (num == rev) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }
}
