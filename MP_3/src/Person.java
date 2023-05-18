import java.io.Serializable;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class Person implements Serializable {
    private EnumSet<Type> es;
    private List<Person> extent = new ArrayList<>();

    private int salary = -1;

    private String name;
    private String surname;
    private int id;

    private List<ClientHistory> history;

    public Person(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
        this.id = id;

        extent.add(this);

        this.es = EnumSet.of(Type.PERSON);
    }

    public List<ClientHistory> getHistory() {
        if(!this.es.contains(Type.CLIENT)){
            System.err.println("This person is not a client");
        }
        return history;
    }

    public void becomeClient(){
        this.es.add(Type.CLIENT);
    }

    public void becomeEmployee(){
        this.es.add(Type.EMPLOYEE);
    }

    private void setSalary(int salary){
        if (this.es.contains(Type.EMPLOYEE)){
            this.salary = salary;
        }else {
            System.err.println("This person is not an employee");
        }
    }

    private int getSalary(){
        if (!this.es.contains(Type.EMPLOYEE)) {
            System.err.println("This person is not an employee");
        }
        return salary;
    }

    public EnumSet<Type> getType(){
        return this.es;
    }
}
