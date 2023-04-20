import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Person implements Serializable {

    private List<Person> extent = new ArrayList<>();

    private String name;
    private String surname;

    private int id;

    private List<ClientHistory> history;

    public Person(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;

        extent.add(this);
    }

    public List<ClientHistory> getHistory() {
        return history;
    }
}
