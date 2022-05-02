package lecture23StaticKeywordSwitchStatement;

public class Martian {
	private String name;
	private static int numMartians = 0;
	
	public Martian(String n) {
		name = n;
		numMartians++;
	}
	
	public String getName() {
		return name;
	}

	public static int getNumMartians() {
		return numMartians;
	}


	public void dealWithEnemy() {
		System.out.print("My name is " + name + ". ");
		if (numMartians < 3) {
			System.out.println(" Where are my friends? I better hide");
		}	
		else {
			System.out.println(" There are quite a few of us, let's fight!");
		}
	}
	
}
