public class Female extends Person{

    private boolean isCapableOfPregnancy;

    public Female(String name, String surname, int id, boolean isCapableOfPregnancy) {
        super(name, surname, id);
        this.isCapableOfPregnancy = isCapableOfPregnancy;
    }

    public Female(String name, String surname, int id, boolean isCapableOfPregnancy, Male male) {
        super(name, surname, id);
        this.isCapableOfPregnancy = isCapableOfPregnancy;
        male = null;
    }
}
