import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervalsBrute {
    public static void main(String[] args) {
        // int arr[][] = { { 1, 3 },
        // { 2, 6 },
        // { 8, 9 },
        // { 9, 11 },
        // { 8, 10 },
        // { 2, 4 },
        // { 15, 18 },
        // { 16, 17 } };

        int arr[][] = {
                { 1, 4 },
                { 4, 5 }
        };

        Arrays.sort(arr, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }

        });

        List<int[]> list = new ArrayList<>();

        int initialInterval = arr[0][0];
        int lastInterval = arr[0][1];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i][0] > lastInterval) {
                list.add(new int[] { initialInterval, lastInterval });
                initialInterval = arr[i][0];
                lastInterval = arr[i][1];
            } else {
                if (arr[i][1] > lastInterval) {
                    lastInterval = arr[i][1];
                }
            }

        }
        list.add(new int[] { initialInterval, lastInterval });

        for (int[] ar : list) {
            System.out.println(ar[0] + " " + ar[1]);
        }
    }
}
