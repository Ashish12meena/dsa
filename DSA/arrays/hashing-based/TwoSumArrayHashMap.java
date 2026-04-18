import java.util.HashMap;
import java.util.Map;

public class TwoSumArrayHashMap {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };

        int target = 14;

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                int key = target-arr[i];
                map.put(key, arr[i]);
            }else{
                System.out.println(arr[i]+" "+map.get(arr[i]));
                break;
            }


        }
    }
}
