public class MissingandRepeatingNumberHashing {
    public static void main(String[] args) {
        int missing = -1;
        int repeating = -1;

        int arr[] = { 4, 3, 6, 2, 1, 1 };

        int hash[]  = new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] = hash[arr[i]]+1;
        }

        for (int i = 1; i < hash.length; i++) {
            if (hash[i]>1) {
                repeating = i;
            }
            if (hash[i]==0) {
                missing = i;
            }
        }

        System.out.println(missing);
        System.out.println(repeating);
    }
}
