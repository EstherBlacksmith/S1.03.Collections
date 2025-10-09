package personalDataFiles;

public class Main {

    public static void main(String[] args) {
        menu();
        PersonManagement.readingFile();
    }


    private static void menu() {
        while (true) {
            int option = 0;
            option = PersonManagement.readInt("1 Read the file\n2 Show people by name (A-Z) \n3 Show people by name (Z-A)"
                    + "\n4 Show people by second name (A-Z)\n5 Show people second name (Z-A)\n6 Show people by DNI (1-9)"
                    + "\n7 Show people by DNI (9-1)\n0 Exit");

            switch (option) {
                case 1 -> {
                    PersonManagement.readingFile();
                }
                case 2 -> {
                    PersonManagement.showPersonByNameAZ();
                }
                case 3 -> {
                    PersonManagement.showPersonByNameZA();
                }
                case 4 -> {
                    PersonManagement.showPersonBySeconNameAZ();
                }
                case 5 -> {
                    PersonManagement.showPersonBySeconNameZA();
                }
                case 6 -> {
                    PersonManagement.showPersonByIdentifier19();
                }
                case 7 -> {
                    PersonManagement.showPersonByIdentifier91();
                }
                case 0 -> {
                    return;
                }
                default -> {
                    System.out.println("Incorrect option");
                }
            }
        }
    }
}