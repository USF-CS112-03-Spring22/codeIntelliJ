package lecture19MoreInheritance;

public class USFStaff extends USFEmployee {
    private int numVacationDays;

    public USFStaff(String name, int id, int officeNumber, int numVacationDays) {
        super(name, id, officeNumber);
        this.numVacationDays = numVacationDays;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Number of vacation days: " + numVacationDays);
    }
}
