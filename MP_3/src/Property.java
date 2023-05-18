import java.io.Serializable;
import java.util.List;

public abstract class Property  implements Serializable {

    private double size;

    private String id;
    private static int defaultPrice = 5;
    private List<ClientHistory> history;

    public double getSize() {
        return size;
    }

    public int getDefaultPrice() {
        return defaultPrice;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public List<ClientHistory> getHistory() {
        return history;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
