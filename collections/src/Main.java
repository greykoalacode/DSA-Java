import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>(new HashSet<>() {{ add(1); add(2); }});

        aList.add(1);
        aList.add(2);
        aList.add(3);

        aList.set(0,-1);

        System.out.println(aList);

//        playingWithGenericList();

//        playWithLinkedList();
    }

    private static void playWithLinkedList(){
        LinkedList<Integer> ll1 = new LinkedList<>();

        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        System.out.println("Print from linkedlist ");
        ListIterator<Integer> listIterator = ll1.listIterator();

        while(listIterator.hasNext()){
            System.out.println("next " + listIterator.next());
        }
    }

    public static void playingWithGenericList() {
        GenericList<Integer> list = new GenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("My first ever written class with iterators, Collections!!");
        Iterator<Integer> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // is same as below

        for (int i : list) {
            System.out.println(i);
        }
    }
}