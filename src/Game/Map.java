package Game;

public class Map {
	
	//When adding objects in the map: 
	//Make an object in the Main and handle this object in the TextHandler
	Room room1 = new Room("Room 1", "", "");
	Room room2 = new Room("Room 2", "", "");
	Room room3 = new Room("Room 3", "", "sword");
	Room room4 = new Room("Room 4", "", "");
	Room room5 = new Room("Room 5", "", "");
	Room room6 = new Room("Room 6", "", "");
	Room room7 = new Room("Room 7", "bloodelf", "");
	Room room8 = new Room("Room 8", "", "");
	Room room9 = new Room("Room 9", "", "apple");
	Room room10 = new Room("Room 10", "", "");
	Room room11 = new Room("Outside", "", "");
	Room room12 = new Room("Outside", "", "");
	Room room13 = new Room("Room 13", "", "");
	Room room14 = new Room("Room 14", "wizzard", "");
	Room room15 = new Room("Outside", "", "");
	Room room16 = new Room("Outside", "", "coin");
	
	Room[][] map = {{room1, room2, room3,  room4},
					{room5, room6, room7,  room8},
					{room9, room10,room11, room12},
					{room13,room14,room15, room16}};
		
	public String getRoom(Room currentLocation) {
		return currentLocation.getName();
	}
	
	public String roomGotCreature(Room currentLocation) {
		return currentLocation.getGotCreature();
	}
	
	public static boolean checkGotObject(Room currentLocation) {
		return currentLocation.checkGotObject();
	}
	
	public static String roomGotObject(Room currentLocation) {
		return currentLocation.getGotObject();
	}
	
	public static void releaseObject(Room currentLocation) {
		currentLocation.releaseObject();
	}
	
	public static void putObjectInRoom(Room currentLocation, Object object) {
		currentLocation.putObjectInRoom(object);
	}
	
	public static void releaseCreature(Room currentLocation) {
		currentLocation.releaseCreature();
	}
	
	public static void putCreatureInRoom(Room currentLocation, Creature creature) {
		currentLocation.putCreatureInRoom(creature);
	}
}
