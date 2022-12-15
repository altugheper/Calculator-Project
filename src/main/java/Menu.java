import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    public void operator(){
        displayMenu();
        switch (input.nextInt()){
            case 1:
                additionMenu();
                break;
            case 2:
                subtractionMenu();
                break;
            case 3:
                multiplicationMenu();
                break;
            case 4:
                dividingMenu();
                break;
            case 5:
                System.out.println("Goodbye!");
                break;
            default:
                System.out.println("You have entered a wrong value");
        }

    }

    public static void displayMenu(){
        System.out.println("Choose an operation: \n" +
                "1. +\n" +
                "2. -\n" +
                "3. *\n" +
                "4. /\n" +
                "5. Exit");
    }

    public void additionMenu(){
        System.out.println("Enter the first number");
        double num1 = input.nextInt();
        System.out.println("Enter the second number");
        double num2 = input.nextInt();
        System.out.println("Your result: " + Methods.additionOperation(num1, num2));
    }

    public void subtractionMenu(){
        System.out.println("Enter the first number");
        double num1 = input.nextInt();
        System.out.println("Enter the second number");
        double num2 = input.nextInt();
        System.out.println("Your result: " + Methods.subtractionOperation(num1, num2));
    }

    public void multiplicationMenu(){
        System.out.println("Enter the first number");
        double num1 = input.nextInt();
        System.out.println("Enter the second number");
        double num2 = input.nextInt();
        System.out.println("Your result: " + Methods.multiplicationOperation(num1, num2));
    }

    public void dividingMenu(){
        System.out.println("Enter the first number");
        double num1 = input.nextInt();
        System.out.println("Enter the second number");
        double num2 = input.nextInt();
        System.out.println("Your result: " + Methods.dividingOperation(num1, num2));
    }
}
