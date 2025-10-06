package integer;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class IntegerExercises {
    static List<Integer> integerListFirst = new ArrayList<>();
    static List<Integer> integerListSecond = new ArrayList<>();

    public static void main(String[] args) {
        addingElements();
        showingLists();
    }


    private static void addingElements() {
        Random randomInt = new Random();
        for (int i = 0; i < 10; i++) {
            integerListFirst.add(randomInt.nextInt(100));
        }

        ListIterator<Integer> listIteratortoCopy  = integerListFirst.listIterator(integerListFirst.size());

        while (listIteratortoCopy.hasPrevious()) {
            integerListSecond.add(listIteratortoCopy.previous());
        }
    }

    private static void showingLists() {
        System.out.println("Original:" );

        ListIterator<Integer> listIterator  = integerListFirst.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nReversed:" );
        ListIterator<Integer> listIteratorReverse  = integerListSecond.listIterator();
        while (listIteratorReverse.hasNext()) {
            System.out.println(listIteratorReverse.next());
        }

    }

}
