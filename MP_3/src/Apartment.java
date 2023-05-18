import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Apartment extends Property{

    private static List<Apartment> extent = new ArrayList<>();

    private List<Person> residents = new ArrayList<>();

    private int apartmentNumber;

    private ApartmentBuilding apartmentBuilding;

    public double getPrice(double pricePerMeter){
        return pricePerMeter*getSize();
    }
    public double getPrice(){
        return this.getDefaultPrice()*getSize();
    }

    public static int getExtentSize(){
        return extent.size();
    }

    public static void createApartment(ApartmentBuilding apartmentBuilding, int apartmentNumber,
                                       double size, String id){
        Apartment apartment = new Apartment(size, apartmentNumber, id);
        if(!apartmentBuilding.getApartments().contains(apartment)){
            apartmentBuilding.getApartments().add(apartment);
            extent.add(apartment);
        }else {
            apartment = null;
        }
    }

    private Apartment(double size, int apartmentNumber, String id){

        this.setSize(size);
        this.apartmentNumber = apartmentNumber;
        this.setId(id);

        extent.add(this);
    }

    @Override
    public String toString() {
        return "Property{" +
                "size=" + this.getSize() +
                "apartmentNumber= " + this.apartmentNumber +
                ", residents=" + this.residents +
                '}';
    }

    public static void save(ObjectOutputStream stream) throws IOException {
        stream.writeObject(extent);
    }
    public static void load(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        extent = (List<Apartment>) stream.readObject();
    }

    public void addResident(Person person){
        residents.add(person);
    }

    public static List<Apartment> getExtent() {
        return extent;
    }
}
