public class recursionmethod {
    public static void main(String[] args) {
int sum=sum(5,10);
        System.out.println(sum);
    }
    static int sum(int start, int end){
       if(end>start){
           return end+sum(start,end-1);
    }
       else {
           return end;
       }
}}
