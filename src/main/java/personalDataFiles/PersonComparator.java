package personalDataFiles;

public class PersonComparator implements java.util.Comparator {

    public static int comparePerson(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
