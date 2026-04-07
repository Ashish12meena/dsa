public class NextPermutation {
    public static void reverse(int arr[], int stInd,int endInd){
        int count=0;
        for (int i = stInd; i <= ((endInd+stInd)/2); i++) {
            int temp = arr[stInd+count];
            arr[stInd+count] = arr[endInd-count];
            arr[endInd-count] = temp;
            count++;
        }
    }
    public static void findNextPermutation(int arr[]){
        int pivot = -1;
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i-1]<arr[i]) {
                pivot = i-1;
                break;
            }
        }
        if (pivot==-1) {
            reverse(arr, 0, arr.length-1);
        }else{
            reverse(arr, pivot+1, arr.length-1);
            for (int i = pivot+1; i < arr.length; i++) {
                if (arr[i]>arr[pivot]) {
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        // 2 4 1 7 5 0
        // 2 4 0 1 5 7 
       int arr[] = {1, 3, 2};

        findNextPermutation(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }   
}
