import java.util.HashMap;
import java.util.Map;

public class _22_CountNumberOfSubrrayWithXorOptimal {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 6, 4 };

        int k =6;

        Map<Integer, Integer> store = new HashMap<>();
        store.put(0, 1);


        int XorSum  =0;
        int count =0;

        for (int i : arr) {
            XorSum = XorSum^i;

            int needed = XorSum^k;

            if (store.containsKey(needed)) {
                count =  count+store.get(needed);
            }

            store.put(XorSum, store.getOrDefault(XorSum, 0)+1);
        }

        System.out.println("Count : "+count);
    }
}
