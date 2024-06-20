package human;

public class Main {
    public static void main(String[] args) {
       truck truck1=new truck();
       truck1.Color();

       truck1.Name("john");

    String  returnvalue= truck1.DisplayInfo();
        System.out.println(returnvalue);
        System.out.println(truck1.DisplayInformation("car"));
    }

    }


