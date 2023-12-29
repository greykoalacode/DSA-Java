import java.util.*;

public class QueueStack {
    public static void main(String[] args) {
//        playWithStacks();
        playWithDeque();
    }

    private static void playWithDeque() {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(1);
        dq.offerFirst(2);

        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);
    }
    private static void playWithStacks() {
        // Stack LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }

    private static void playWithQueue() {
        // FIFO queue
        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        que.offer(2);

        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.remove());
    }
}
