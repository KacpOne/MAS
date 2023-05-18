import java.util.Date;

public class PurchaseContract extends Document implements IPurchaseContract{

    private int price;

    public PurchaseContract(int doc_id, int size, Date created, int price) {
        super(doc_id, size, created);
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
}
