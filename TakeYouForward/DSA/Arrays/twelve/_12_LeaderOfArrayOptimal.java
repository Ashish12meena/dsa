import java.util.ArrayList;
import java.util.List;

public class _12_LeaderOfArrayOptimal {
    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};

        // we have to start from right so we have track which is max because only greater than max is next leader
        List<Integer> resultList = new ArrayList<>();

        int max = arr[arr.length-1];
        resultList.add(max);

        for (int i = arr.length-2; i >=0; i--) {
            if (arr[i]>max) {
                resultList.add(arr[i]);
                max = arr[i];
            }
        }

        System.out.println(resultList);
    }
}
