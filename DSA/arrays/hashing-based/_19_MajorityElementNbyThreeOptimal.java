import java.util.ArrayList;
import java.util.List;

public class _19_MajorityElementNbyThreeOptimal {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 3, 3, 4, 4, 4 };

        int var1 = 0;
        int var2 = 0;

        int count1 = 0;
        int count2 = 0;

        // 🔹 Phase 1: Find candidates
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == var1) {
                count1++;
            } else {
                if (arr[i] == var2) {
                    count2++;
                } else {
                    if (count1 == 0) {
                        var1 = arr[i];
                        count1 = 1;
                    } else {
                        if (count2 == 0) {
                            var2 = arr[i];
                            count2 = 1;
                        } else {
                            count1--;
                            count2--;
                        }
                    }
                }
            }
        }

        // 🔹 Phase 2: Verify actual counts
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == var1) {
                count1++;
            } else {
                if (arr[i] == var2) {
                    count2++;
                }
            }
        }

        List<Integer> list = new ArrayList<>();

        if (count1 > arr.length / 3) {
            list.add(var1);
        }

        if (count2 > arr.length / 3) {
            list.add(var2);
        }

        // Output
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}