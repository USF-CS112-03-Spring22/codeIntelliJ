package lecture26Recursion;

//  Author: Lewis/Loftus
// The driver class for Towers of Hanoi example
public class TowersOfHanoiSolver {


    //-----------------------------------------------------------------
    //  Creates a TowersOfHanoi puzzle and solves it.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        TowersOfHanoi towers = new TowersOfHanoi(5);
        towers.solve();


    }

}
