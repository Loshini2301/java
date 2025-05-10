import java.util.*;

public class insertelement {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(List.of(1,3,5,7,9,10));
        ArrayList<Integer> arr1=new ArrayList<>(List.of(4,6,112,42));
        arr.addAll(arr1);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
