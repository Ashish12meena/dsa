// Given an unsorted array of size n. Array elements are in the range of 1 to n. 
// One number from set {1, 2, ...n} is missing and one number occurs twice in the array. 
// The task is to find these two numbers.

// Examples: 

// Input: arr[] = {3, 1, 3}
// Output: 3, 2
// Explanation: In the array, 2 is missing and 3 occurs twice.

// Input: arr[] = {4, 3, 6, 2, 1, 1}
// Output: 1, 5
// Explanation: 5 is missing and 1 is repeating.

import java.util.Arrays;

public class MissingRepeatingNumbers {
    public static  void MissingRepeatingFunction(int a[]){
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i]==a[i-1]) {
                System.out.println("Duplicate Element is : "+a[i]);
            }else{
                if (a[i]!=(a[i-1]+1)) {
                    System.out.println("Element "+(a[i-1]+1)+" is missing");
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {4, 3, 6, 2, 1, 1};
        MissingRepeatingFunction(a);
    }
}