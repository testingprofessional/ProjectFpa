package Game;

public class Creature {
	private String sort;
	private String name;
	private int health; // 0 - 100
	private int power; // 0 - 50
	private int luck; // 0 - 5
	
		Creature(String sort, String name, int health, int power, int luck) {
			this.sort = sort;
			this.name = name;
			this.health = health;
			this.power = power;
			this.luck = luck;
	}
		public String getSort() {
			return this.sort;
		}
		
		public String getName() {
			return this.name;
		}
		
		public int getHealth() {
			return this.health;
		}
		
		public void setHealth(int number) {
			this.health = number;
		}
		
		public int getPower() {
			return this.power;
		}
		
		public void setPower(int number) {
			this.power = number;
		}
		
		public int getLuck() {
			return this.luck;
		}
		
		public void setLuck(int number) {
			this.luck = number;
		}
		
		public void eatApple() {
			boolean isAppleInInv = objectHandler.checkIfObjectIsInInv(Main.apple);
			
			if(isAppleInInv) {
					this.health += 20;
					System.out.println("Your health is increased with 20");
				} else {
					System.out.println("There is no apple in your inventory");
			}
		}
}
