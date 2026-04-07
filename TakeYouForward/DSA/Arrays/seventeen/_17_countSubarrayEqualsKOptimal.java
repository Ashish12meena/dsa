import java.util.HashMap;
import java.util.Map;

public class _17_countSubarrayEqualsKOptimal {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };

        int k =3;

        int sum =0;
        int count =0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);  //base condition 0 always exist

        for (int i : arr) {
            sum = sum+i;

            int needed = sum -k;  // needed decide sum that we can remove to make perfect subarray and map contain that info

            if (map.containsKey(needed)) {
                count = count + map.get(needed);  // frequency decide how much subarray we can remove for that sum
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);  // if not exist then add 1 for sum if exist then increase frequency to 1 in existing
        }

        System.out.println();

        System.out.println(count);
    }

}