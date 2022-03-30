package lecture17Iterator_Inheritance;

/** From the book : Java 1.4 Game programming 
 * A super class. Represents some intelligent life form that can talk.
 */
public class Creature {
	private String greeting;

	public Creature(String greeting) {
		this.greeting = greeting;
	}


	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String s) {
		greeting = s;
	}

	public void speak() {
		System.out.println("Creature says: " + greeting);
	}

}
