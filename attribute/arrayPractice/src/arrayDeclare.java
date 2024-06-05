import java.util.Arrays;
import java.util.Scanner;

public class arrayDeclare {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("access no third");
        System.out.println(arr[2]);
        sum(arr);
        System.out.println("Array Length " + arr.length);
        String name = "Ifra";
        System.out.println("String Array " + name.length());
        maxValue(arr);
        displayArrayForEach(arr);
        System.out.println("\nOriginal Array");
        int[] duplicateArray = Arrays.copyOf(arr, arr.length);
        displayArrayForEach(duplicateArray);
//        System.out.print(duplicateArray);
        try {
            System.out.println(arr[8]);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private static void displayArrayForEach(int[] arr) {

        for(int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]);
//            System.out.println(index +" != " + (arr.length-1));
            if(index != arr.length-1){
                System.out.print(", ");
            }else {
                System.out.println(".");
            }
        }
    }

    static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of array " + sum);

    }

    static void maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Number of Array is " + max);
    }


}








