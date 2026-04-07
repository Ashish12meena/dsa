import java.util.Arrays;

public class MajorityElementMorethanHalf {
    public static int find(int arr[]){
        if (arr.length==1) {
            return arr[0];
        }
        int majority = -1;
        Arrays.sort(arr);
        for (int arrInd = 0; arrInd < (arr.length/2); arrInd++) {
            if (arr[arrInd]==arr[arrInd+((int)Math.ceil(arr.length/2.0))]) {
                return arr[arrInd];
            }
        }
        return majority;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 2, 2, 5, 2};
        long start = System.nanoTime();
        int result  =find(arr);
        long end = System.nanoTime();

        System.out.println("Total time taken " + (end - start) + " ns");

        System.out.println("Result of majority element: "+ result);
    }
}
