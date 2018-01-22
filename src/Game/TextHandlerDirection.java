package Game;

public class TextHandlerDirection {
	
	static boolean wizzardTrue = false;
	static boolean bloodelfTrue = false;
	
	static int widthMap = 0;
	static int hightMap = 0;
	static Map map = new Map();
	
	public static Room currentLocation = map.map[widthMap][hightMap];
	
	public void directionHandler(String input) {
		
		switch(input) {
		case "WHERE" : showLocation();
			break;
		case "N" : if (hightMap >= 1) {
			hightMap--;
			currentLocation = map.map[widthMap][hightMap];
			showLocation();
			
			checkCreaturesAndObjects();
			}
				 else {
				System.out.println("You can't go any more North");
			}
			break;
		case "E" : if (widthMap <= 2) {
			widthMap++;
			currentLocation = map.map[widthMap][hightMap];
			showLocation();
						
			checkCreaturesAndObjects();
			}
				 else {
				System.out.println("You can't go any more East");
			}
			break;
		case "S" : if (hightMap <= 2) {
			hightMap++;
			currentLocation = map.map[widthMap][hightMap];
			showLocation();
			
			checkCreaturesAndObjects();
			}
				 else {
				System.out.println("You can't go any more South");
			}
			break;
		case "W" : if (widthMap >= 1) {
			widthMap--;
			currentLocation = map.map[widthMap][hightMap];
			showLocation();
			
			checkCreaturesAndObjects();
			}
				 else {
				System.out.println("You can't go any more West");
			}
			break;
		default  : System.out.println("Wrong direction input. Choose 'N', 'E', 'S' or 'W'.");
			break;
		}
	}
		
	public void checkCreaturesAndObjects() {
		
		if (map.roomGotCreature(currentLocation).equals("wizzard")) {
			wizzardTrue = true;
		} else if (map.roomGotCreature(currentLocation).equals("bloodelf")){
			bloodelfTrue = true;
		} else {
			wizzardTrue = false;
			bloodelfTrue = false;
		}
		
		if(map.roomGotCreature(currentLocation) != "") {
			System.out.println("There is a " + map.roomGotCreature(currentLocation) + " in this room !!!");
		} 
		
		if(map.roomGotObject(currentLocation) != "") {
			System.out.println("There is a " + map.roomGotObject(currentLocation) + " in this room !!!");
		}
	}
	
	public void showLocation() {
		System.out.println("You are now in: " + map.getRoom(currentLocation));
	}
}
