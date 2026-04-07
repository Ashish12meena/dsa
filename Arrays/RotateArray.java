public class RotateArray {
    public static void rotate(int a[], int times) {
        int ftemp = 0;
        int stemp = 0;
        while (times > 0) {

            ftemp = a[0];
            for (int i = 0; i < a.length - 1; i++) {
                stemp = a[i + 1];
                a[i + 1] = ftemp;
                ftemp = stemp;
            }
            a[0] = ftemp;
            times--;
        }
    }

    public static void main(String[] args) {
         int[] a = new int[1000];
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        long start = System.nanoTime();
        rotate(a, 300);  // Rotate 300 times to the right
        long end = System.nanoTime();

        System.out.println("Total time: " + (end - start) + " ns");

        // Optional: print array
        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}
