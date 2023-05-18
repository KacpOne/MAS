import java.util.Date;

public class LeasePurchaseContract extends RentContract implements IPurchaseContract{

    private int finalPayment;
    public LeasePurchaseContract(int doc_id, int size, Date created, Date startDate,
                                 Date endDate, int monthlyPayment, int length, int finalPayment) {

        super(doc_id, size, created, startDate, endDate, monthlyPayment, length);
        this.finalPayment = finalPayment;
    }

    @Override
    public int getPrice() {

        return finalPayment+(this.getMonthlyPayment()*this.getLength());
    }
}
