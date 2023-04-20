import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientHistory {
    private List<ClientHistory> extent = new ArrayList<>();

    private Person client;
    private Property property;
    private Date start;
    private Date end;

    public ClientHistory(Property property, Person client, Date start){
        this.property = property;
        this.client = client;
        this.start = start;

         extent.add(this);

         client.getHistory().add(this);
         property.getHistory().add(this);
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
