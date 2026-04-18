// remove this arr1[arr1pointer]==arr2[arr2pointer] if duplicate allow
public class IntersectionOfSortedArray {
    public static boolean isAlreadyExist(int arr[], int lastIndex, int n) {
        if (lastIndex == 0) {
            return false;
        }
        if (arr[lastIndex - 1] == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int arr2[] = { 2, 3, 3, 5, 6, 6, 7 };

        int newArray[] = new int[Math.max(arr1.length, arr2.length)];

        int arr1pointer = 0;
        int arr2pointer = 0;

        int lastIndex = 0;

        while (arr1pointer < arr1.length && arr2pointer < arr2.length) {
            if (arr1[arr1pointer] == arr2[arr2pointer] && !isAlreadyExist(newArray, lastIndex, arr1[arr1pointer])) {
                newArray[lastIndex] = arr1[arr1pointer];
                lastIndex++;
                arr1pointer++;
                arr2pointer++;
            } else if (arr1[arr1pointer] < arr2[arr2pointer]) {
                arr1pointer++;
            } else {
                arr2pointer++;
            }
        }
        System.out.println();

        for (int i = 0; i < lastIndex; i++) {
            System.out.println(newArray[i]);
        }
    }
}
