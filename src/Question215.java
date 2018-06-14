import java.util.PriorityQueue;

public class Question215 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        Question215 test = new Question215();
        test.findKthLargest(new int[] { 3, 2, 1, 5, 6, 4}, 2);
    }
}
