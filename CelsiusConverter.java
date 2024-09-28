import java.util.Scanner;

public class Main {
private double celsius;

public void Main()
{
    this.celsius = 0;
}

public void setCelsius (double celsius)
{
    this.celsius = celsius;


}

public double getCelsius(){
    return this.celsius;
}

public double convertToFahrenheit(){
    return(this.celsius * 9/5)+32;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main converter = new Main();
        System.out.print("Enter Celsius Value: ");
        converter.setCelsius(input.nextDouble());
        System.out.println("\nCelsius value is: " + converter.getCelsius());
        System.out.println("Fahrenheit value is: " + converter.convertToFahrenheit());
    }
    
}
