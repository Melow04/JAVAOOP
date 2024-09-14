
import java.util.Scanner;
public class app {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double b, h, area;
        System.out.print("Enter base: ");
        b = sc.nextDouble();
        System.out.print("Enter height: ");
        h = sc.nextDouble();
        area = 0.5*b*h;
        System.out.println("The area of triangle: " + area);

    }
}