
import java.util.PriorityQueue;

public class ThirdLargestElement {
   private final static PriorityQueue<Integer> queue = new PriorityQueue<>();
    public static void add(int num) {
        if (queue.size() < 3) {
            queue.offer(num);
        } else if (num > queue.peek()) {
            queue.poll();       // remove smallest
            queue.offer(num);   // insert new larger
        }
    }
    public static void findThirdLargest(int arr[]){
        for (int i : arr) {
            add(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 14, 2, 16, 10, 20};
        findThirdLargest(arr);
        System.out.println(queue);
    }
}
