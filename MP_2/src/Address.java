import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Address implements Serializable {

    private List<Address> extent = new ArrayList<>();
    private String city;
    private String street;
    private int number;

    public Address(String city, String street, int number){
        this.city = city;
        this.street = street;
        this.number = number;

        extent.add(this);
    }


    @Override
    public String toString() {
            return "Address{" +
                    ", city='" + this.city + '\'' +
                    ", street='" + this.street + '\'' +
                    ", number=" + this.number +
                    '}';
    }
}
