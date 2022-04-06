package lecture19MoreInheritance;

public class USFEmployee extends USFPerson {
    private int officeNumber;

    public USFEmployee(String name, int id, int officeNumber) {
        super(name, id);
        this.officeNumber = officeNumber;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(officeNumber);
    }
}
