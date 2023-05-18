import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClientHistory {
    private List<ClientHistory> extent = new ArrayList<>();

    private Person client;
    private Property property;
    private Date start;
    private Date end;

    private ClientHistory(Property property, Person client, Date start){

        this.property = property;
        this.client = client;
        this.start = start;

         extent.add(this);

         client.getHistory().add(this);
         property.getHistory().add(this);
    }

    public ClientHistory createHistory(Property property, Person client, Date start, String name){

        if(client.getType().contains(Type.CLIENT)){
            return new ClientHistory(property,client,start);
        }else{
            System.err.println("Cant create ClientHistory for person that isn't a client");
        }
        return null;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
