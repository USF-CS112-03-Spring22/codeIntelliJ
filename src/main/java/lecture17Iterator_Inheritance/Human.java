package lecture17Iterator_Inheritance;

/**
 * From the book : Java 1.4 Game programming. Represents a Human, a subclass of
 * Creature. Overrides speak() method to say: Human says <getGreeting()> ! *
 */
public class Human extends Creature {
	private String firstName;

	public Human(String firstName, String greeting) {
		super(greeting);
		this.firstName = firstName;

	}

	// TODO: Override the speak method from class Creature so that
	// that a human says their name first, then the greeting
	// For instance: Jannet says hi

}
