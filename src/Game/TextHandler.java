package Game;

import java.util.Scanner;

public class TextHandler {
	
	TextHandlerDirection texthandlerDirection = new TextHandlerDirection();
	Scanner scanner = new Scanner(System.in);
	
	public void handleText() {
	
	System.out.println("OK> ");	
	String input = scanner.nextLine().toUpperCase();
	
	switch(input) {
		case "EXIT": Text.exit();
					 break;
		case "WHERE": texthandlerDirection.directionHandler(input);
					 break;
		case "N" :
		case "E" :
		case "S" :
		case "W" : 	texthandlerDirection.directionHandler(input);
					break;
		case "GET APPLE" : objectHandler.putInArraylist(Main.apple);
							break;
		case "DROP APPLE" : objectHandler.getItemOutFromArraylist(Main.apple);
							break;
		case "EAT APPLE" :  Main.player.eatApple();
							objectHandler.getItemOutOfMap(Main.apple);
							break;
		case "GET SWORD" : objectHandler.putInArraylist(Main.sword);
							break;
		case "DROP SWORD" : objectHandler.getItemOutFromArraylist(Main.sword);
							break;
		case "GET COIN" : objectHandler.putInArraylist(Main.coin);
							break;
		case "DROP COIN" : objectHandler.getItemOutFromArraylist(Main.coin);
							break;
		case "INV" 		 :
		case "INVENTORY" : for(Object val : objectHandler.objects) {
							System.out.println(val.getName());
							}
							break;
		case "STAT"   :
		case "STATUS" : System.out.println("Health:" + Main.player.getHealth() + " - Power:" + Main.player.getPower());
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



