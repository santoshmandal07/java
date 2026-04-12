import java.util.Scanner;
public class armstrong {        
    public static void main(String[] args){
        int num, remainder, result = 0;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i = num;
        while(num != 0)
        {
            remainder = num % 10;
            result = result + (remainder * remainder * remainder);
            num = num / 10;
        }
        if(i == result)
        {
            System.out.print(i +" is an Armstrong Number.");
        }
        else
        {
            System.out.print(i +" is not an Armstrong Number.");
        }
        sc.close();
    }
}
