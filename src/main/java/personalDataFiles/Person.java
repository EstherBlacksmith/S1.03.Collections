package personalDataFiles;

public class Person {
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
        return name + "     " + secondName + "      " +  DNI ;
    }

}
