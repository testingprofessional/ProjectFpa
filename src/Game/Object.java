package Game;

public class Object {
	private String name;
	private int power;
	
		Object(String name, int power) {
			this.name = name;
			this.power = power;
		}
		
	public String getName() {
		return this.name;
	}
	
	public int getPower() {
		return this.power;
	}
}
