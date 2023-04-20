import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class House extends Property{

    private static List<House> extent = new ArrayList<>();

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

    public static int getExtentSize(){
        return extent.size();
    }

    public House(double size, Address address, String id){
        this.size=size;
        this.address = address;
        this.setId(id);

        extent.add(this);
    }

    @Override
    public String toString() {
        return "House{" +
                "size=" + this.size +
                ", address=" + this.address.toString() +
                ", residents=" + this.residents +
                '}';
    }

    public static void save(ObjectOutputStream stream) throws IOException {
        stream.writeObject(extent);
    }
    public static void load(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        extent = (List<House>) stream.readObject();
    }

    public void addResident(String name){
        residents.add(name);
    }

    public static List<House> getExtent() {
        return extent;
    }
}
