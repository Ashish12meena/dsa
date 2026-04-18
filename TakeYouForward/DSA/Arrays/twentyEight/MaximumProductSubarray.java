public class MaximumProductSubarray {
    public static void main(String[] args) {

        int arr[] = {2, 3, -2, 4};

        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < arr.length; i++) {

            // reset if product becomes 0
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            // build product from both sides
            prefix *= arr[i]; 
            suffix *= arr[arr.length - 1 - i];

            // update answer
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }

        System.out.println(maxProduct);
    }
}