import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ApartmentBuilding implements Serializable{

    private static List<ApartmentBuilding> extent = new ArrayList<>();

    private Address address;
    private List<Apartment> apartments = new ArrayList<>();
    private int floors;

    public ApartmentBuilding(int floors, Address address){
        this.floors = floors;
        this.address = address;

        extent.add(this);
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void destroy(){
        for(int i = 0; i < this.apartments.size(); i++){
            Apartment.getExtent().remove(this.apartments.get(i));
            this.apartments.remove(this.apartments.get(i));
        }
        extent.remove(this);
    }
}
