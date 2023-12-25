import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> aList = new ArrayList<>();

        aList.add(1);
        aList.add(2);
        aList.add(3);

        aList.set(0,-1);

        System.out.println(aList);
    }

    public void playingWithGenericList() {
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