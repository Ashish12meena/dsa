import java.util.Arrays;

public class _24_MergeSrotedArrayWithoutExtraSpace {
    public static void swap(int arr1[], int arr2[] , int arr1Index , int arr2Index){
        int temp = arr1[arr1Index];
        arr1[arr1Index] = arr2[arr2Index];
        arr2[arr2Index] = temp;

    }
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 0, 2, 6, 8, 9 };

        int i = arr1.length-1;
        int j = 0;

        while (i>=0 && j < arr2.length) {
            if (arr1[i]>arr2[j]) {
                swap(arr1, arr2, i, j);
                i--;
                j++;
            }else{
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int l : arr1) {
            System.out.println(l);
        }

        for (int l : arr2) {
            System.out.println(l);
        }
    }
}
