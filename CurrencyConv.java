import java.util.Scanner;
public class CurrencyConv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, dollar, euro, yuan, koruna, krone, sheqel, dinar;
        System.out.print("Enter Philippine Peso: ");
        peso = sc.nextDouble();
        System.out.println();
        dollar = peso/43.33089;
        euro = dollar*0.734719;
        yuan = dollar*6.346934 ;
        koruna = dollar* 18.77263;
        krone = dollar* 5.449007;
        sheqel = dollar*3.726334;
        dinar = dollar* 0.274588;
        
        System.out.println("The Amount is Equivalent to: ");
        System.out.println();
        System.out.printf("US Dollar\t :\t%.3f\n",dollar );
        System.out.printf("Euro\t\t :\t%.6f\n", euro);
        System.out.printf("Yuan\t\t :\t%.6f\n", yuan);
        System.out.printf("Koruna\t\t :\t%.6f\n", koruna);
        System.out.printf("Krone\t\t :\t%.6f\n", krone);
        System.out.printf("Sheqel\t\t :\t%.6f\n", sheqel);
        System.out.printf("Dinar\t\t :\t%.6f\n",dinar );

    }
}
