    public class MaximumSubarraykadane {
        public static int find(int arr[]){
            int realmax=arr[0];
            int max = arr[0];
            for (int arrInd = 1; arrInd < arr.length; arrInd++) {
                    if ((max+arr[arrInd])>arr[arrInd]) {
                        max=max+arr[arrInd];
                    }else{
                        max = arr[arrInd];
                    }
                    if (realmax<max) {
                        realmax=max;
                    }
            }
            return realmax;
        }
        public static void main(String[] args) {
            int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int result =  find(arr);
            System.out.println();
            System.out.println(result);
        }
    }
