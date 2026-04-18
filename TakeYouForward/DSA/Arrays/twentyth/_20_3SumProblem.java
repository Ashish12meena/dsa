import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _20_3SumProblem {
    public static void main(String[] args) {

        int n =0;


        // if we go with brute force
        

        int arr[] = {-1, 0, 1, 2, -1, -4};

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if ((arr[i]+arr[j]+arr[k])==n) {
                        List<Integer> temp =  Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(temp);

                        if (!set.contains(temp)) {
                            set.add(temp);
                        }
                    }
                }
            }
        }

        for (List<Integer> list : set) {
            System.out.println(list);
        }
        

    }
}
