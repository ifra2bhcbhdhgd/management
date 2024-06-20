import Calculator.Calculator;

import java.util.Scanner;

public class MethodOverloding {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc=new Scanner(System.in);
        int option;
        displayMenu();
        option = sc.nextInt();
        subMenu(option, sc, calculator);

    }

    private static void subMenu(int option, Scanner sc, Calculator calculator) {
        if(option == 1){
            System.out.print("1. Add Integer Data Type Values\n2. Add Float Data Type Values\n3. Add Double Data Type Values\nSelect Option Value : ");
            option = sc.nextInt();
            if(option == 1){
                System.out.print("1. Add Two Integer Numbers\n2. Add Three Integer Numbers\nSelect Option Value : ");
                option = sc.nextInt();
                if(option == 1){
                    System.out.print("Enter First Number : ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter Second Number : ");
                    int num2 = sc.nextInt();
                    System.out.println("Result : " + calculator.add(num1, num2));
                } else if (option == 2) {
                    System.out.print("Enter First Number : ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter Second Number : ");
                    int num2 = sc.nextInt();
                    System.out.print("Enter Third Number : ");
                    int num3 = sc.nextInt();
                    System.out.println("Result : " + calculator.add(num1, num2, num3));
                }
            } else if (option == 2) {
                System.out.print("1. Add Two Float Numbers\n2. Add Three Float Numbers\nSelect Option Value : ");
                option = sc.nextInt();
                if(option == 1){
                    System.out.print("Enter First Number : ");
                    float num1 = sc.nextFloat();
                    System.out.print("Enter Second Number : ");
                    float num2 = sc.nextFloat();
                    System.out.println("Result : " + calculator.add(num1, num2));
                } else if (option == 2) {
                    System.out.print("Enter First Number : ");
                    float num1 = sc.nextFloat();
                    System.out.print("Enter Second Number : ");
                    float num2 = sc.nextFloat();
                    System.out.print("Enter Third Number : ");
                    float num3 = sc.nextFloat();
                    System.out.println("Result : " + calculator.add(num1, num2, num3));
                }
            } else if (option == 3) {
                System.out.print("1. Add Two Double Numbers\n2. Add Double Integer Numbers\nSelect Option Value : ");
                option = sc.nextInt();
                if(option == 1){
                    System.out.print("Enter First Number : ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter Second Number : ");
                    double num2 = sc.nextDouble();
                    System.out.println("Result : " + calculator.add(num1, num2));
                } else if (option == 2) {
                    System.out.print("Enter First Number : ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter Second Number : ");
                    double num2 = sc.nextDouble();
                    System.out.print("Enter Third Number : ");
                    double num3 = sc.nextDouble();
                    System.out.println("Result : " + calculator.add(num1, num2, num3));
                }
            } else{
                System.out.println("Wrong Input");
            }
        } else if (option == 2) {
            System.out.print("1. Subtract Integer Data Type Values\n2. Subtract Float Data Type Values\n3. Subtract Double Data Type Values\nSelect Option Value : ");
            option = sc.nextInt();

        } else if (option == 3) {
            System.out.print("1. Multiply Integer Data Type Values\n2. Multiply Float Data Type Values\n3. Multiply Double Data Type Values\nSelect Option Value : ");
            option = sc.nextInt();
            if(option == 1){
                System.out.print("1. Multiply Two Integer Numbers\n2. Multiply Three Integer Numbers\nSelect Option Value : ");
            } else if (option == 2) {
                System.out.print("1. Multiply Two Float Numbers\n2. Multiply Three Float Numbers\nSelect Option Value : ");
            } else if (option == 3) {
                System.out.print("1. Multiply Two Double Numbers\n2. Multiply Double Integer Numbers\nSelect Option Value : ");
            } else{
                System.out.println("Wrong Input");
            }
        } else if (option == 4) {
            System.out.print("1. Divide Integer Data Type Values\n2. Divide Float Data Type Values\n3. Divide Double Data Type Values\nSelect Option Value : ");
            option = sc.nextInt();
        } else if (option == 5) {
            System.out.print("1. Remainder Integer Data Type Values\n2. Remainder Float Data Type Values\n3. Remainder Double Data Type Values\nSelect Option Value : ");
            option = sc.nextInt();
        } else if (option == 6) {
            System.out.print("1. Power Integer Data Type Values\n2. Power Float Data Type Values\n3. Power Double Data Type Values\nSelect Option Value : ");
            option = sc.nextInt();
        }else{
            System.out.println("Wrong Input.");
        }
    }

    private static void displayMenu() {
        System.out.println("Welcome to Calculator Main Menu");
        System.out.print("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Remainder\n6. Power\nSelect Option Value : ");
    }

}
