import java.util.Scanner;

public class BudgetTrackerPlus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your monthly income");
        double income = scanner.nextDouble();
        System.out.println("Enter your expenses");
        System.out.println("For rent?");
        double rent = scanner.nextDouble();
        System.out.println("For groceries?");
        double groceries = scanner.nextDouble();
        System.out.println("For transportation?");
        double transportation = scanner.nextDouble();
        System.out.println("For entertainment?");
        double entertainment = scanner.nextDouble();
        double expenses = rent + groceries + transportation + entertainment;
        String expenseFormat = String.format("Your expenses are $%.2f dollars.", expenses);
        System.out.println(expenseFormat); // outputs the calculated expenses.
        double remainBudget = income - expenses;
        System.out.printf("Your remain budget is $%.2f dollars.", remainBudget);
        double perRent = (rent / income) * 100;
        double perGroceries = (groceries / income)  * 100;;
        double perTransportation = (transportation / income) * 100;;
        double perEntertainment = (entertainment / income) * 100;;
        System.out.println("\n******Budget Summary******");
        System.out.printf("Spent $%.2f on Rent (%.2f%% of income)\n", rent, perRent);
        System.out.printf("Spent $%.2f on Groceries (%.2f%% of income)\n", groceries, perGroceries);
        System.out.printf("Spent $%.2f on Transportation (%.2f%% of income)\n", transportation, perTransportation);
        System.out.printf("Spent $%.2f on Entertainment (%.2f%% of income)\n", entertainment, perEntertainment);


        scanner.close();








    }
}
