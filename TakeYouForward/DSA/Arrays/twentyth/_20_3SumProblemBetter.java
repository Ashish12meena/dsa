import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _20_3SumProblemBetter {
    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };

        int n = 0;

        // we first sort it
        Set<List<Integer>> store = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            Set<Integer> set = new HashSet<>();


            for (int j = i + 1; j < arr.length; j++) {
                if (set.contains(n - (arr[i] + arr[j]))) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], (n - (arr[i] + arr[j])));
                    Collections.sort(temp);
                    if (!store.contains(temp)) {
                        store.add(temp);
                    }
                }
                set.add(arr[j]);
            }
        }

        for (List<Integer> list : store) {
            System.out.println(list);
        }

    }
}