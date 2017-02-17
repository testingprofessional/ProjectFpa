package Game;

import java.util.ArrayList;

public class objectHandler {
	static ArrayList<Object> objects = new ArrayList<>();
	
	static public void putInArraylist(Object item) {
		objects.add(item);
		Map.releaseObject(TextHandlerDirection.currentLocation);
		System.out.println("You put a " + item.getName() + " in your inventory");
	}
	
	static public void getItemOutFromArraylist(Object item) {
		if(!Map.checkGotObject(TextHandlerDirection.currentLocation)) {
			objects.remove(item); 
			Map.putObjectInRoom(TextHandlerDirection.currentLocation, item);
			System.out.println("You dropped your " + item.getName() + " in this room");
		} else {
			System.out.println("There is allready a " + Map.roomGotObject(TextHandlerDirection.currentLocation) + " in this room. It's full"); 
		}
	}
}
