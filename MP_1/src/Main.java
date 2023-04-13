import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class Main {
    static String fileName = "data.txt";

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("1) Load");
                System.out.println("2) Create Properties");
                System.out.println("3) Save");
                System.out.println("4) Print Properties");
                System.out.println("5) Print Property Count");

                System.out.println("0) Exit");
                System.out.println("====================");

                Scanner in = new Scanner(System.in);
                String s = in.nextLine();

                switch (s) {
                    case "1" -> loadExtents();
                    case "2" -> createProperties();
                    case "3" -> saveExtents();
                    case "4" -> printProperties();
                    case "5" -> printPropertyCount();
                    case "0" -> System.exit(0);
                    default -> System.out.println("Bad Input");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void createProperties(){
        Address address1 = new Address("Warszawa", "Mazowiecka", 10);
        Address address2 = new Address("Warszawa", "Górska", 5);
        Address address3 = new Address("Lublin", "Lublińska", 1, 100);
        Address address4 = new Address("Kraków", "Krakowska", 2, 45);
        Address address5 = new Address("Gdańsk", "Gdańska", 60);

        Property property1 = new Property(100, address1);
        property1.addResident("Tomek Testowy");
        property1.addResident("Adam Małysz");
        property1.addResident("Losowy Typ");

        Property property2 = new Property(10, address2);
        property2.addResident("Jan Papież II");
        property2.addResident("Mariusz Pudzianowski");
        property2.addResident("Kaz Bałagane");

        Property property3 = new Property(74, address3);
        property3.addResident("Robert Lewandowski");
        property3.addResident("Twoja Stara");
        property3.addResident("Twój Stary");

        Property property4 = new Property(25, address4);
        property4.addResident("Marcin Marcinkowski");
        property4.addResident("Michał Michalski");
        property4.addResident("Bogdan Bogdański");

        Property property5 = new Property(92, address5);
        property5.addResident("Jakub Jakubski");
        property5.addResident("Jarosław Tusk");
        property5.addResident("Donald Kaczyński");
    }

    private static void saveExtents() throws IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(fileName));

        Property.save(stream);
    }

    private static void loadExtents() throws IOException, ClassNotFoundException {
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(fileName));

        Property.load(stream);
    }

    private static void printProperties(){
        for(Property property : Property.getExtent()){
            System.out.println(property.toString());
            System.out.println("-----------------------------------------------------");
        }
    }

    private static void printPropertyCount() {
        System.out.println(Property.getSize());
    }
}