import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Address implements Serializable {

    private List<Address> extent = new ArrayList<>();
    private String city;
    private String street;
    private int number;
    private boolean ifHouse;
    private int flatNumber;

    public Address(String city, String street, int number){
        this.city = city;
        this.street = street;
        this.number = number;
        this.ifHouse = true;

        extent.add(this);
    }

    public Address(String city, String street, int number, int flatNumber){
        this.city = city;
        this.street = street;
        this.number = number;
        this.ifHouse = false;
        this.flatNumber=flatNumber;

        extent.add(this);
    }

    @Override
    public String toString() {
        if (this.ifHouse) {
            return "Address{" +
                    ", city='" + this.city + '\'' +
                    ", street='" + this.street + '\'' +
                    ", number=" + this.number +
                    '}';
        }
        else {
            return "Address{" +
                    ", city='" + this.city + '\'' +
                    ", street='" + this.street + '\'' +
                    ", number=" + this.number +
                    ", flatNumber=" + this.flatNumber +
                    '}';
        }
    }
}
