import java.util.Date;

public class RentContract extends Document{

    private Date startDate;
    private Date endDate;

    private int length;
    private int monthlyPayment;
    public RentContract(int doc_id, int size, Date created, Date startDate,
                        Date endDate, int monthlyPayment, int length) {
        super(doc_id, size, created);
        this.startDate = startDate;
        this.endDate = endDate;
        this.monthlyPayment = monthlyPayment;
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }
    public int getMonthlyPayment(){
        return this.monthlyPayment;
    }
}
