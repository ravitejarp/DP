package inheritence;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        SampleInt sampleInt = new Class1();
        sampleInt.print();
        Class1 class1 = new Class2();
        class1.print();

        List<String> lis = new ArrayList<>();
        lis.add("Ravi");
        lis.add("Teja");
        lis.add("Ravuri");
        lis.forEach(l->{
            if (l.equals("Teja")) {
                System.out.println("Returned");
                return;
            }else{
                System.out.println(l);
            }

        });

    }
}
