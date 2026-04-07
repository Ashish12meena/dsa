public class RemoveDuplicatesFromSortedArray {
    public static int removDuplicate(int nums[]){
        int sortedIndex = 0;
        for (int j = sortedIndex+1; j < nums.length; j++) {
            if (nums[j]>nums[sortedIndex]) {
                int temp = nums[j];
                 nums[j] =nums[sortedIndex+1] ;
                 nums[sortedIndex+1] = temp;
                 sortedIndex++;
            }
        }
        return sortedIndex;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
        int newLength = removDuplicate(nums);
        System.out.println("New length of the array after removing duplicates: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i <= newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
