public class FindMissingNumberInArray {
    public static int calculateSumOFNumbers(int n){
        int sum = 0;
        sum = (n*(n+1))/2;
        return sum;
    }
    public static int calulateSumOfArray(int arr[]){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = 5;

        int missingNumber = calculateSumOFNumbers(n)-calulateSumOfArray(arr);
        if (missingNumber!=0) {
            System.out.println();
            System.out.println(missingNumber);
        }


    }
}
