package lecture17Iterator_Inheritance;

/**
 * From the book : Java 1.4 Game programming. Represents an Alien, a subclass of
 * Creature. Overrides speak() method to say: Alien from planet
 * <nameOfPlanet> says <getGreeting()> ! Has a fight() method that is not in the
 * superclass.
 */

public class Alien extends Creature {

	private String planet; // the name of the planet

	public Alien(String greeting, String planet) {
		super(greeting);
		this.planet = planet;

	}

	// TODO: Override the speak method of class Creature so that an alien says his planet first,
	// then the greeting (stored in the parent class).
	// For instance,if an alien is from Mars and the greeting is hi, this method would print:
	// Alien from planet Mars says hi
}
