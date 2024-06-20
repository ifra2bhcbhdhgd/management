public class overloadMethod {
    public static void main(String[] args) {
int  Mymethod  = Mymethod(4,6);
        System.out.println(Mymethod);
 double    mtMethod = mtMethod(56.7,78.0);
        System.out.println(mtMethod);
    }
    static int Mymethod(int x,int y){
        return x+y;
    }
    static double mtMethod(double x,double y){
        return x+y;
    }
}
