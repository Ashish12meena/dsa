public class _13_LongestConsecutiveSequence {
    public static boolean isConsecutiveExist(int n, int arr[]){
         for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                return true;
            }
         }
         return false;
    }

    public static int countConsecutive(int n, int arr[]){
        int count =0;
        while (isConsecutiveExist(n++, arr)) {
            count++;
        }
        
        return count;

    }
    public static void main(String[] args) {
        int arr[] = {102,4,100,1,101,3,2,1,1};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int count =  countConsecutive(arr[i], arr);

            if (count>max) {
                max=count;
            }
        }

        System.out.println();
        System.out.println("count: "+max);

    }
}