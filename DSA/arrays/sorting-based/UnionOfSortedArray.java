public class UnionOfSortedArray {
    public static boolean isAlreadyExist(int arr[], int number,int newpointer) {
        if (newpointer==0) {
            return false;
        }
        if (arr[newpointer-1]==number) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5, 6 };

        int newArray[] = new int[arr1.length + arr2.length];
        int arr1pointer = 0;
        int arr2pointer = 0;
        int newArrayPointer = 0;

        while (arr1pointer < arr1.length && arr2pointer < arr2.length) {
            if (arr1[arr1pointer] < arr2[arr2pointer] && !isAlreadyExist(newArray, arr1[arr1pointer],newArrayPointer)) {
                newArray[newArrayPointer] = arr1[arr1pointer];
                newArrayPointer++;
                arr1pointer++;

            } else if (arr2[arr2pointer] <= arr1[arr1pointer] && !isAlreadyExist(newArray, arr2[arr2pointer],newArrayPointer)) {
                newArray[newArrayPointer] = arr2[arr2pointer];
                newArrayPointer++;
                arr2pointer++;
            } else {
                arr1pointer++;
                arr2pointer++;
            }
        }

        for (int i = arr1pointer; i < arr1.length; i++) {
            if (!isAlreadyExist(newArray, arr1[i],newArrayPointer)) {
                newArray[newArrayPointer] = arr1[arr1pointer];
                newArrayPointer++;
            }
            arr1pointer++;
        }

        for (int i = arr2pointer; i < arr2.length; i++) {   
            if (!isAlreadyExist(newArray, arr2[i],newArrayPointer)) {
                newArray[newArrayPointer] = arr2[arr2pointer];
                newArrayPointer++;
            }
            arr2pointer++;
        }

        for (int i = 0; i < newArrayPointer; i++) {
            System.out.println(newArray[i]);
        }

    }
}