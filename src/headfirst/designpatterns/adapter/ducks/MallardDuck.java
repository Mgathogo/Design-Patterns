package headfirst.designpatterns.adapter.ducks;

public class MallardDuck implements Duck {
	public void quack() {
		System.out.println("I am Quacking like a Duck because I am a Duck!");
	}
 
	public void fly() {
		System.out.println("And I'm flying like one too!");
	}
}
