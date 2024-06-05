import java.util.Scanner;

public class arrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int[] array =new int[5];
        int i;

        for(i = 0; i < 5; i++){
            System.out.print("enter the number");
            array[i]=sc.nextInt();
        }

        int temp=0;
        int s=2;
        int end=3;
        temp=array[s];
        array[s]=array[end];
        array[end]=temp;

        for(i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }



    }
}
