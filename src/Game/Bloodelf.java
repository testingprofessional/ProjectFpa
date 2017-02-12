package Game;

public class Bloodelf extends Creature {
	private String sort;
	private String name;
	private int health; // 0 - 100
	private int power; // 0 - 50
	private int luck; // 0 - 5

	Bloodelf(String sort, String name, int health, int power, int luck) {
		super(sort, name, health, power, luck);
		this.sort = sort;
		this.name = name;
		this.health = health;
		this.power = power;
		this.luck = luck;
	}
}


