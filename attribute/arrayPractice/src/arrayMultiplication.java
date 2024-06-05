import java.util.Scanner;

public class arrayMultiplication {
    public static void main(String[] args) {
        int[] array = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");

        for ( int i = 0; i <= 4; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the third element of array");
        System.out.println(array[2]);
        System.out.println( "length array " +array.length);
        String str=Integer.toString(array.length);
        System.out.println("string length " +str);
duplicateArray(array);

        sum(array);
        maxValue(array);
    }

    static void sum(int[] array){
        int sum =0;
        for(int i=0;i<=4;i++){
            sum=sum+array[i];

        }
        System.out.println("sum number " +sum);

    }
    static void maxValue(int[] array){
        int max=array[0];
        for(int i=1;i<=5;i++){
            if(max>array[i])
                max=array[i];

        }
        System.out.println( "max number " +max);
    }
    static void duplicateArray(int[] array){
        for(int number:array){
            System.out.print(number  +", ");
        }

    }

}
