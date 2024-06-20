package AddCalculator2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OptionCalculator addition = new OptionCalculator();
        System.out.println("Welcome to the calculator ");
        System.out.println("1. add\n2. substract\n3. multiply\n4. divide");
        System.out.println("select menue :");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        addmenue(option, addition, sc);

    }

    public static void addmenue(int option, OptionCalculator addition, Scanner sc) {
        if (option == 1) {
            System.out.println("1.add two numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println(addition.add(num1, num2));
        }
           else if(option==2){
                System.out.println("substract two number");

                System.out.println("enter two number");
                int num1= sc.nextInt();
                int num2= sc.nextInt();
                System.out.println(addition.substract(num1,num2));
            }
           else if (option==3) {
                System.out.println("multyply two number");
                int num1= sc.nextInt();
                int num2= sc.nextInt();
                System.out.println(addition.multiply(num1,num2));
            } else if (option==4){
                System.out.println("devide two number");
                int num1= sc.nextInt();
                int num2= sc.nextInt();
            System.out.println(addition.devide(num1,num2));

            }
           else {
            System.out.println("wrong input");
        }

        }

    }

