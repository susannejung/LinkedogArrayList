import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LinkedList<Integer> l1=new LinkedList<>();
        l1.add(1);
        l1.add(5);
        l1.add(2);
        Collections.sort(l1);
        for(int i=0;i<l1.size();i++)
            System.out.println(l1.get(i));

        int m=Collections.max(l1);
        System.out.println(m);

        //Comparator<Integer> reverseOrder = null;
        //Collections.sort(l1,Collections.reverseOrder());
        Collections.sort(l1,Collections.reverseOrder());
        for(int i=0;i<l1.size();i++)
            System.out.println(l1.get(i));
        System.out.println("Hej");
        Collections.sort(l1,null);
        for(int i=0;i<l1.size();i++)
            System.out.println(l1.get(i));


    }
}