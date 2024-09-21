import java.util.Scanner;

public class DeclaringArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] area1 = new double[10];
        double [] area2 = new double[10];
       

     
        // create a Java program finds out the average temperature of Area1 and Area2 in 10 days. The input capable of accepting decimal numbers.


        double sum1 = 0;
        double sum2 = 0;
        System.out.println("================================");

        System.out.println("ENTER THE TEMPERATURE OF AREA 1");
        System.out.println("================================");

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Day " + (i + 1) + ": ");
            area1 [i] =input.nextDouble();
        }
        System.out.println();

        System.out.println("================================");

        System.out.println("ENTER THE TEMPERATURE OF AREA 2");
        System.out.println("================================");

        for (int i = 0; i < 10; i++){
            System.out.print("Day " + (i + 1) + ": ");
            area2 [i] =input.nextDouble();
        }

        for (int i = 0; i < 10 ; i++) {
            sum1 += area1[i];
        }

        for (int i = 0; i < 10 ; i++) {
            sum2 += area2[i];
        }

        double average1 = sum1 /10;
        double average2 = sum2 /10;
        System.out.println();
        System.out.println("================================");


        System.out.printf("\nAverage of Area1 : %.3f",average1);

        System.out.printf("\nAverage of Area2 : %.3f",average2);
    }
}
