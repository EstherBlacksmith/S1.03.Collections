package month;

import java.util.*;

public class Main {
    static ArrayList <Month> monthsArray;
    static Set monthsSet = new HashSet <Month>();
    public static void main(String[] args) {
        init();
    }

    private static void init(){
        monthsArray = new ArrayList();
        addingMonths();

        Month month = new Month("August");
        monthsArray.add(5,month);

        showingMonths();

        arrayListToHashSet(month);

        iteratingSet();

    }

    private static void addingMonths(){
        Calendar calendar = Calendar.getInstance();

        for (int i = 0; i < 11; i++) {
            calendar.set(2025, i, 1);
            String monthName = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.UK);
            Month month = new Month(monthName);
            monthsArray.add(month);
        }
    }

    private static void showingMonths() {
        for (int i = 0; i < monthsArray.size(); i++) {
            Month monthToSee = (Month) monthsArray.get(i);
            System.out.println(monthToSee.getName());
        }
    }

    private static void arrayListToHashSet(Month month) {
        monthsSet = Set.of(monthsArray);

        try {
            System.out.println("Trying to add "+ month.getName() + " again...");
            monthsSet.add(month);
            System.out.println(month.getName() + " added again o.O");

        } catch (UnsupportedOperationException e) {
            System.out.println(month.getName() + " cannot be added more than once");
        }
    }

    static void  iteratingSet(){
        System.out.println("\nWith 'for loop'\n");
        for (int i = 0; i < monthsArray.size(); i++) {
            System.out.println( monthsArray.get(i).getName());
        }

        System.out.println("\nWith iterator:\n");

        Iterator <Month> iter  = monthsArray.iterator();
        while(iter.hasNext()){
            Month mes = iter.next();
            System.out.println(mes.getName());
        }

    }
}