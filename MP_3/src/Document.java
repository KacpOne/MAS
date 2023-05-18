import java.util.Date;

public class Document {

    private int doc_id;
    private int size;

    private Date created;

    public Document(int doc_id, int size, Date created){
        this.doc_id = doc_id;
        this.size = size;
        this.created = created;
    }
}
