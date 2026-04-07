import java.util.HashSet;
import java.util.Set;

public class _13_LongestConsectiveSequenceOptima {
    public static void main(String[] args) {
        int arr[] = { 102, 4, 100, 1, 101, 3, 2 };

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int maxCount = 0;

        for (int n : set) {

            //only start counting if number is bigning of sequence 
            if (!set.contains(n - 1)) {
                int count = 1;
                while (set.contains(++n)) {
                    count++;
                }
                if (maxCount < count) {
                    maxCount = count;
                }
            }
        }

        System.out.println("maxCount "+maxCount);

    }
}
