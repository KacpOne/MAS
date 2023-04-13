import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Property implements Serializable {

    private static List<Property> extent = new ArrayList<>();

    private static int defaultPrice = 5;
    private double size;
    private Address address;
    private List<String> residents = new ArrayList<>();

    public double getPrice(double pricePerMeter){
        return pricePerMeter*size;
    }
    public double getPrice(){
        return defaultPrice*size;
    }

    public static int getSize(){
        return extent.size();
    }

    public Property(double size, Address address){
        this.size=size;
        this.address = address;

        extent.add(this);
    }

    @Override
    public String toString() {
        return "Property{" +
                "size=" + this.size +
                ", address=" + this.address.toString() +
                ", residents=" + this.residents +
                '}';
    }

    public static void save(ObjectOutputStream stream) throws IOException{
        stream.writeObject(extent);
    }
    public static void load(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        extent = (List<Property>) stream.readObject();
    }

    public void addResident(String name){
        residents.add(name);
    }

    public static List<Property> getExtent() {
        return extent;
    }
}
