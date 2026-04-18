public class TwoSumForSortedArray {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 5, 8, 11 };

        int target = 14;

        int fp = 0;
        int lp = arr.length-1;

        while (fp<=lp) {
            if ((arr[fp]+arr[lp])==target) {
                System.out.println(arr[fp]+" : "+arr[lp]);
                break;
            }

            if ((arr[fp]+arr[lp])>target) {
                lp--;
            }else{
                fp++;
            }
        }

        
    }
}
