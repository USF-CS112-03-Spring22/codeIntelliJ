package lecture19MoreInheritance;

public class USFPerson {
    private String name; // person's name
    private int id; // person's id

    /**
     * Constructor for class Person. Initializes name and id.
     * @param name name
     * @param id id
     */
    public USFPerson(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    /**
     * Getter for name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(name + ": " + id);
    }

}
