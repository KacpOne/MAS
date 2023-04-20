import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Company {

    private static int counter = 1;
    private List<Person> employees = new ArrayList<>();
    private Map<String, Property> properties = new HashMap<>();

    public Company(){}

    public void addProperty(Property property){
        if(property.getClass().getName().equals("Apartment")){
            properties.put("A" + counter, property);
        } else {
            properties.put("H" + counter, property);
        }
        counter++;
    }
}
