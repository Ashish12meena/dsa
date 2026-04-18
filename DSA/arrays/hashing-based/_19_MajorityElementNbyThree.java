

public class _19_MajorityElementNbyThree {
    // public static boolean contatains(List<Integer> list, int n) {

    // Iterator<Integer> iterator = list.iterator();

    // while (iterator.hasNext()) {
    // if (iterator.next() == n) {
    // return true;
    // }
    // }

    // return false;
    // }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 3, 3, 4, 4, 4 };

        // only at max two number have n/3 majority

        int var1 = -1;
        int var2 = -1;

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if ((var1 == arr[i]) || (var2 == arr[i])) {
                continue;
            }

            for (int j = i; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > (arr.length / 3)) {
                if (var1 == -1) {
                    var1 = arr[i];
                } else {
                    var2 = arr[i];
                }
            }

        }

        System.out.println(var1 + " and " + var2);
    }
}
