package personalDataFiles;

import java.util.Objects;

public class Person {
    protected String name;
    protected String secondName;
    protected String DNI;

    public Person(String name, String secondName, String DNI) {
        Objects.requireNonNull(name, "Name must not be null");
        if(name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;

        Objects.requireNonNull(secondName, "Second Name must not be null");
        if(secondName.isBlank()) {
            throw new IllegalArgumentException("Second Name  cannot be empty.");
        }
        this.secondName = secondName;

        Objects.requireNonNull(DNI, "DNI must not be null");
        if(DNI.isBlank()) {
            throw new IllegalArgumentException("DNI cannot be empty.");
        }
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
