import java.util.HashMap;
import java.util.Map;


public class MajorityElement {
    public static int findMojorityElement(int arr[]) {
        Map<Integer,Integer> maps =  new HashMap<>();
        for (int arrInd = 0; arrInd < arr.length; arrInd++) {
            if (maps.containsKey(arr[arrInd])) {
                maps.put(arr[arrInd], (maps.get(arr[arrInd])+1));
            }else{
                maps.put(arr[arrInd], 1);
            }
        }
        

        int maxValue = 0;
        int maxKey = 0;
       for (Map.Entry<Integer, Integer> entry : maps.entrySet()) {
        if (entry.getValue() > maxValue) {
            maxValue = entry.getValue();
            maxKey = entry.getKey();
        }
    }
        // return maxEntry.getKey();
        return maxKey;
    }
    public static void main(String[] args) {
       int arr[] = {1, 1, 2, 1, 3, 5, 1};
      int maxValue= findMojorityElement(arr);
      System.out.println("Max Value in array is "+maxValue);
    }

    
}
