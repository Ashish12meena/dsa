import java.util.HashMap;
import java.util.Map;

public class MajorityElementFromArray {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 3, 3, 7, 3, 3, 0, 3, 5, 3 };

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], (map.getOrDefault(arr[i], 0) + 1));
        }

        int maxValue = Integer.MIN_VALUE;
        int maxKey = -1;

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue()>maxValue) {
                maxValue = i.getValue();
                maxKey = i.getKey();
            }
        }

        System.out.println("max number "+maxKey+"  "+maxValue);
    }
}
