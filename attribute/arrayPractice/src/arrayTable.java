import java.util.Scanner;

public class arrayTable {
    public static void main(String[] args) {
//        int[] array={1,3,4};
//        array[0]=1;
//        array[1]=3;
//        array[2]=4;
//        System.out.println(array[1]);
        int i =1;
        int[] table=new int[11];
        int number=2;
        

        for( i=1;i<=10;i++){
            table[i] = number * (i);

            System.out.println(2 +" *  "+ i +" = "+  + table[i]);
        }





    }

}
