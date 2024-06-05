import java.util.Arrays;
import java.util.Scanner;

public class javaArray {
    public static void main(String[] args) {
        String[] days = new String[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        for (int i = 0; i <= 4; i++) {
            days[i] = sc.next();
        }
        System.out.println("length of array " + days.length);

        double[] number = {12.8, 87.88, 88.99};
        Average(number);
        multiarray();
        excitelement();
        ascendingNumber();
    }

    static void Average(double[] number) {

        double average ;
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        average = sum / 3;
        System.out.println("Average is " + average);


    }

    static void multiarray() {
        int[][] multiArray = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        System.out.println("multiArray example " + multiArray[1][3]);


    }

    static void excitelement() {
        int[] element = new int[5];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements");
        for (int i = 0; i <= 4; i++) {
            element[i] = sc.nextInt();
        }
        System.out.println("enetr the exict number ");
        int n = sc.nextInt();
        for (int i = 0; i <= 4; i++) {
            if (n == element[i]) count++;
        }
        if (count > 0) {
            System.out.println("element exict " + n);
        } else {
            System.out.println("does not exict");

        }
    }

    static void ascendingNumber() {
        int[] array = new int[5];
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the numbers");
        for (int i = 0; i <= 4; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i <= 4; i++) {
            for (int j = i + 1; j <= 4; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i <= 4; i++) {


            System.out.print(array[i] + " ");
        }

    }
}





