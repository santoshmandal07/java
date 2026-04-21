import java.util.Scanner;
public class areaAndPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length Of the Rectangle: ");
        double Length = sc.nextDouble();
        System.out.print("Enter the Breadth Of the Rectangle: ");
        double Breadth = sc.nextDouble();
        double area = Length * Breadth;
        double perimeter = 2 * (Length + Breadth);
        System.out.println("Area of the Rectangle: " + area);
        System.out.println("Perimeter of the Rectangle: " + perimeter);
        sc.close();
    }
}
