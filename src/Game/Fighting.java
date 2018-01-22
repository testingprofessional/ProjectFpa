package Game;

import java.util.Random;

public class Fighting {
	
	static Random random = new Random();
	static Creature wizzard = new Wizzard("Wizzard", "The Grey One", 20, 40, 4);
	static Creature bloodelf = new Bloodelf("Bloodelf", "Legolaz", 20, 45, 5);
	static Creature enemyToFight;
	
	static public void fight(String action, String enemy){
		if(enemy.equals("WIZZARD") && TextHandlerDirection.wizzardTrue) {
			enemyToFight = wizzard;
		} else if(enemy.equals("BLOODELF") && TextHandlerDirection.bloodelfTrue) {
			enemyToFight = bloodelf;
		} else {
			System.out.println("This room doesn't have a " + enemy);
			return;
		}
		switch(action) {
			case "PUNCH": fight(enemyToFight);
							System.out.println("Health you: " + Main.player.getHealth());
							System.out.println("Health " + enemyToFight.getSort() + ": " + enemyToFight.getHealth());
						  break;
			case "KICK": fight(enemyToFight);
							System.out.println("Health you: " + Main.player.getHealth());
							System.out.println("Health " + enemyToFight.getSort() + ": " + enemyToFight.getHealth());
						  break;
			case "MAGIC": fight(enemyToFight);
							System.out.println("Health you: " + Main.player.getHealth());
							System.out.println("Health " + enemyToFight.getSort() + ": " + enemyToFight.getHealth());
						  break;
			default:      break;
		}
	}

	static public void fight(Creature enemy) {
		int randomNumberEnemy = random.nextInt(10);
		int enemyHealth = enemy.getHealth();
		int randomNumberPlayer = random.nextInt(6);
		int playerHealth = Main.player.getHealth();
		int tempEnemy = enemyHealth - randomNumberEnemy;
		int tempPlayer = playerHealth - randomNumberPlayer;
		String sort = enemy.getSort();
		
		if(tempEnemy <= 0) {
			System.out.println("The " + sort + " is dead");
			Map.releaseCreature(TextHandlerDirection.currentLocation);
			tempEnemy = 0;
			enemy.setHealth(tempEnemy);
			
			switch(sort) {
			case "Bloodelf": TextHandlerDirection.bloodelfTrue = false;
							break;
			case "Wizzard": TextHandlerDirection.wizzardTrue = false;
							Map.putObjectInRoom(TextHandlerDirection.currentLocation, Main.coin);
							System.out.println("The Wizzard dropped a little coin out of his pocket");
							break;
			default:   		break;
			}
			
			} else {
				enemy.setHealth(tempEnemy);
			}
		if(tempPlayer <= 0) {
			System.out.println("You are dead");
			Text.exit();
			} else {
				Main.player.setHealth(tempPlayer);
			}
		}
	}

