public class Male extends Person{

    private String militaryClass;

    public Male(String name, String surname, int id, String militaryClass) {
        super(name, surname, id);
        this.militaryClass = militaryClass;
    }

    public Male(String name, String surname, int id, String militaryClass, Female female) {
        super(name, surname, id);
        this.militaryClass = militaryClass;

        female = null;
    }
}
