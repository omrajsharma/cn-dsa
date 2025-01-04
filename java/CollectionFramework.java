import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionFramework {
    public static void main(String[] args) {
        System.out.println("#### Collection Framework ###");

        int[] arrOrg = new int[10];
        System.out.println(java.util.Arrays.toString(arrOrg));

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr.size());
        System.out.println(arr.get(0));

        System.out.println(arr);

        arr.add(1, 10);

        System.out.println(arr);

        arr.set(1, 20);

        System.out.println(arr);

        System.out.println(arr.contains(100));

        System.out.println(arr.indexOf(200));


        System.out.println();


    }
}