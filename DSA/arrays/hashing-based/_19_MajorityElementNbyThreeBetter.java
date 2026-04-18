import java.util.HashMap;
import java.util.Map;

public class _19_MajorityElementNbyThreeBetter {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 3, 3, 4, 4, 4 };

        // only at max two number have n/3 majority

        int minimal = arr.length / 3;

       

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println();

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue()>minimal) {
                System.out.println(i.getKey());
            } 
        }

    }
}
