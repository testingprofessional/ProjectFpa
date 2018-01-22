package Game;

public class Main {
	static boolean running = true;
	static Player player = new Player("Player", "Me", 100, 50, 5);
	static Object apple = new Object("apple", 0);
	static Object sword = new Object("sword", 20);
	static Object coin = new Object("coin", 0);
	
	public static void main(String[] args) {
		
		TextHandler texthandler = new TextHandler();
		Text.welcome();
		
		//Main loop
		while(running){
			texthandler.handleText();
		}
	}
}
