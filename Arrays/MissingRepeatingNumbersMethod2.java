// You can afford O(n) space.

// You want faster execution (linear time).

// You don’t want to modify the input array.



public class MissingRepeatingNumbersMethod2 {
     public static  void MissingRepeatingFunction(int a[]){
       int frequency[] = new int[a.length];
       for (int i = 0; i < frequency.length; i++) {
            int position = a[i];
            frequency[position-1] = frequency[position-1]+1;
       }
       for (int i = 0; i < frequency.length; i++) {
             if (frequency[i]==0) {
                System.out.println("Missing element is : "+(i+1));
             }
             if (frequency[i]>1) {
                System.out.println("duplicate Element is : "+(i+1));
             }
       }
    }
    public static void main(String[] args) {
        int a[] = {4, 3, 6, 2, 1, 1};
        MissingRepeatingFunction(a);
    }
}
