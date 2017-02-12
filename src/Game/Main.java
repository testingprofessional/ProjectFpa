package Game;

import java.util.Scanner;

public class Main {
	static boolean running = true;
	static Player player = new Player("Player", "Me", 100, 50, 5);
	static Object apple = new Object("apple", 0);
	static Object sword = new Object("sword", 0);
	
	public static void main(String[] args) {
		
		TextHandlerDirection texthandler = new TextHandlerDirection();
		Scanner scanner = new Scanner(System.in);
		
		Text.welcome();
		
		//Main loop
		while(running){
		System.out.println("OK> ");	
		String input = scanner.nextLine().toUpperCase();
		
		switch(input) {
		case "EXIT": Text.exit();
					 break;
		case "WHERE": texthandler.directionHandler(input);
					 break;
		case "N" :
		case "E" :
		case "S" :
		case "W" : 	texthandler.directionHandler(input);
					break;
		case "GET APPLE" : objectHandler.putInArraylist(apple);
							break;
		case "DROP APPLE" : objectHandler.getItemOutFromArraylist(apple);
							break;
		case "GET SWORD" : objectHandler.putInArraylist(sword);
							break;
		case "DROP SWORD" : objectHandler.getItemOutFromArraylist(sword);
							break;
		case "INVENTORY" : for(Object val : objectHandler.objects) {
							System.out.println(val.getName());
							}
							break;
		case "STATUS" : System.out.println("Health:" + player.getHealth() + " - Power:" + player.getPower());
							break;
		case "PUNCH WIZZARD" : Fighting.fight("PUNCH", "WIZZARD");
							break;
		case "PUNCH BLOODELF" : Fighting.fight("PUNCH", "BLOODELF");
							break;
		case "KICK WIZZARD" : Fighting.fight("KICK", "WIZZARD");
							break;
		case "KICK BLOODELF" : Fighting.fight("KICK", "BLOODELF");
							break;
		case "MAGIC WIZZARD" : Fighting.fight("MAGIC", "WIZZARD");
							break;
		case "MAGIC BLOODELF" : Fighting.fight("MAGIC", "BLOODELF");
							break;
		default  :  System.out.println("Please choose another input like: GET, DROP, INVENTORY, STATUS, PUNCH, KICK, MAGIC, EXIT, WHERE, N, E, S or W");
					break;
			}	
		}
	}
}
