import java.util.*;
import java.util.stream.Collectors;

public class QueueStack {
    public static void main(String[] args) {
//        playWithQueue();
//        playWithStacks();
//        playWithDeque();
//        playWithPriorityQueue();
        playWithMaps();
//        playWithSets();
    }

    private static void playWithMaps() {
        Map<String, Integer> nullScores = new HashMap<>();
        nullScores.put(null, 0);
        nullScores.put("first", 3);
        nullScores.put(null, 1);
        Set<Map.Entry<String, Integer>> nullEntries = nullScores.entrySet();
        for(Map.Entry<String, Integer> entry: nullEntries)
            System.out.println(entry.getKey()+" "+entry.getValue());

        Map<String, Integer> scores = new Hashtable<>();
        scores.put(null, 0);
        scores.put("first",1);

        Set<Map.Entry<String, Integer>> entries = scores.entrySet();
        for(Map.Entry<String, Integer> entry: entries)
            System.out.println(entry.getKey()+" "+entry.getValue());
    }

    private static void playWithSets() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(0);
        set.add(-1);
        set.add(1);
        // custom class
        //        ------- get top 3 acc to maths marks
        List<StudentScore> scoreList = new ArrayList<>();
        scoreList.add(new StudentScore(70, 80));
        scoreList.add(new StudentScore(30, 10));
        scoreList.add(new StudentScore(80, 40));
        scoreList.add(new StudentScore(57, 92));
        scoreList.add(new StudentScore(94, 80));

        Set<StudentScore> ssSet = new HashSet<>(scoreList);
        System.out.println(ssSet.contains(new StudentScore(70, 80)));

        for (StudentScore ss : ssSet)
            System.out.print("ss = " + ss.hashCode() + "\n");

        List<Integer> lst2 = List.of(0, 3, 4, 2);
//        List<Integer> positiveNumbers = set.stream().filter(each -> each > 0).collect(Collectors.toList());
        System.out.println(set);
        set.retainAll(lst2);
        System.out.println(set);
//        System.out.println(positiveNumbers);
    }

    private static void playWithPriorityQueue() {
//        USing custom comparator class
//        PriorityQueue<Integer> pqImpl = new PriorityQueue<>(new MyCustomComparator());
//        Using Comparator passed as lambda
        PriorityQueue<Integer> pqImpl = new PriorityQueue<>((a, b) -> b - a);
        pqImpl.offer(1);
        pqImpl.offer(2);
        pqImpl.offer(0);
        pqImpl.offer(3);

        System.out.println(pqImpl);
//        System.out.println(pqImpl);
        // top 2 elements
        List<Integer> top2 = new ArrayList<>();

        while (!pqImpl.isEmpty()) {
            if (top2.size() == 2)
                break;
            top2.add(pqImpl.poll());
        }

        System.out.println(top2);
        System.out.println(pqImpl);

//        ------- get top 3 acc to maths marks
        List<StudentScore> scoreList = new ArrayList<>();
        scoreList.add(new StudentScore(70, 80));
        scoreList.add(new StudentScore(30, 10));
        scoreList.add(new StudentScore(80, 40));
        scoreList.add(new StudentScore(57, 92));
        scoreList.add(new StudentScore(94, 80));

        PriorityQueue<StudentScore> studentScores = new PriorityQueue<>((s1, s2) -> s2.getPhysics() - s1.getPhysics());

        for (StudentScore ss : scoreList)
            studentScores.offer(ss);

        // top 3 elements
        List<StudentScore> top3 = new ArrayList<>();

        while (!studentScores.isEmpty()) {
            if (top3.size() == 3)
                break;
            top3.add(studentScores.poll());
        }
        System.out.println(top3);
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
        // Stack using ArrayDeque
        Deque<Integer> stackUsingAD = new ArrayDeque<>();
        stackUsingAD.offerFirst(1);
        stackUsingAD.offerFirst(2);
        stackUsingAD.offerFirst(3);

        System.out.println(stackUsingAD);
        while (!stackUsingAD.isEmpty()) {
            System.out.println(stackUsingAD.peekLast());
            stackUsingAD.pollLast();
        }
        stackUsingAD.poll();
        System.out.println(stackUsingAD);

        // Stack LIFO using Stack class
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.peek());
//            stack.pop();
//        }
    }

    private static void playWithQueue() {
        // FIFO queue
        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        que.offer(2);

        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que);
    }
}
