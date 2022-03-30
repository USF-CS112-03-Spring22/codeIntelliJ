package lecture17Iterator_Inheritance;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(4, 5, "094251", "Ford");
        Truck tr1 = new Truck(2, 2, "587036", "Jeep", false);

        System.out.println(tr1);
        Vehicle v2 = tr1;      //upcasting. always ok
        System.out.println(v2); // which toString will be called?

        // System.out.println(v2.isPickup()); will not work!
        //Truck tr2 = (Truck)v2; //downcasting. ok
        // boolean b = tr2.isPickup(); //ok
        // System.out.println(((Truck)v2).isPickup()); // ok, downcasing
        // tr2 = (Truck)v1; // what will happen if you uncomment and run the code?
        //System.out.println(v1.getClass().getSimpleName());

    }
}
