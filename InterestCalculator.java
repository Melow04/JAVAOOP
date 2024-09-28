import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        Integer year, month, day, totalMonth, totalDay;
        double balance, interest, annualBalance, monthlyBalance, dailyBalance, monthlyRate, dailyRate;
        totalMonth = 10 * 12;
        totalDay = 10 * 365;

        do {
            // get the balance and interest


            System.out.println("\n================================================");
            System.out.println("   Welcome to the Compound Interest Calculator");
            System.out.println("================================================");


            System.out.print("\nEnter Bank account balance: ");
            balance = sc.nextDouble();

            System.out.print("\nEnter interest rate(e.g. (10) for 10%): ");
            interest = sc.nextDouble()/100;

            // after getting the balance and interest 10 years
            System.out.println("\n\n================================================");
            System.out.println("\t10 Years Compound Interest");
            System.out.println("================================================");


            // annual compound interest
            annualBalance = balance;
            for (year = 1; year <= 10; year++) {
                annualBalance += annualBalance * interest;
            }
            System.out.printf("\nAnnual Interest: %.3f",annualBalance);
            System.out.println();


            // monthly compound interest
            monthlyBalance = balance;
            monthlyRate = interest / 12;
            for (month = 1; month <= totalMonth; month++) {
                monthlyBalance += monthlyBalance * monthlyRate;
            }
            System.out.printf("\nMonthly Interest: %.3f", monthlyBalance);
            System.out.println();


            // daily compund interest
            dailyBalance = balance;
            dailyRate = interest / 365;
            for (day = 1; day <= totalDay; day++) {
                dailyBalance += dailyBalance * dailyRate;
            }
            System.out.printf("\nDaily Interest: %.3f", dailyBalance);
            System.out.println();


            System.out.print("\nDo you want to continue?(yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));
        sc.close();

    }
}
