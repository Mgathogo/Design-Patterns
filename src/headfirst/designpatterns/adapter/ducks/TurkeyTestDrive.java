package headfirst.designpatterns.adapter.ducks;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		WildTurkey turkey = new WildTurkey();
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
		testTurkey(duckAdapter);
		System.out.println("\nThe Turkey says...");
		testTurkey(turkey);
 
		for(int i=0;i<2;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
		
	}
	static void testTurkey(Turkey turkey) {
		turkey.gobble();
		turkey.fly();
	}
}

