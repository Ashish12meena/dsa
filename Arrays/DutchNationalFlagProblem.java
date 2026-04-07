public class DutchNationalFlagProblem {
    public static void arrange(int arr[]){
        int count[] = new int[3];
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) {
                count[0] =count[0]+1;
            }else if (arr[i]==1) {
                count[1] =count[1]+1;
            }else{
                count[2] =count[2]+1;
            }
        }
        int index=0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                newArr[index] = i;
                index++;
            }
        }
        for (int i : newArr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        long start = System.nanoTime();
        arrange(arr);
        long end = System.nanoTime();
        System.out.println("Total time"+(end-start));
    }
}
