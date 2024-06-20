import java.util.Scanner;

public class subtractCalculator {
    public static void main(String[] args) {


        System.out.println("Welcome to the calculator ");
        System.out.println("1. add\n2. substract\n3. multiply\n4. divide");
        System.out.println("select menue :");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("enter two number");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        addmenue(option,num1,num2);

    }

    public static void addmenue(int option, int num1,int num2) {
        if (option == 1) {
            System.out.println("add number");
            System.out.println(num1+num2);
        }
        else if(option==2){
            System.out.println("substract number");
            System.out.println(num1-num2);
        }
        else if (option==3) {
            System.out.println("multiply number");
            System.out.println(num1*num2);
        } else if (option==4){
            System.out.println("devide number");
            System.out.println(num1/num2);

        }
        else {
            System.out.println("wrong input");
        }

    }

}
