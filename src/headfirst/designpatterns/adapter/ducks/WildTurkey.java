package headfirst.designpatterns.adapter.ducks;

public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("Gobble gobble, I am a turkey for your Thanksgiving!");
	}
 
	public void fly() {
		System.out.println("I'm flying a short distance because I am a Turkey");
	}
}
