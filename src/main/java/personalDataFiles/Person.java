package personalDataFiles;

public class Person implements java.util.Comparator<Person>{
    protected String name;
    protected String secondName;
    protected String DNI;

    public Person(String name, String secondName, String DNI) {
        this.name = name;
        this.secondName = secondName;
        this.DNI = DNI;
    }

    protected String getName() {
        return name;
    }

    protected String getSecondName() {
        return secondName;
    }

    protected String getDNI() {
        return DNI;
    }
    @Override
    public String toString() {
        return name + " " + secondName + "." +  DNI ;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }


    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }

    @Override
    public int compare(Person o1, Person o2) {
        return 0;
    }
}
