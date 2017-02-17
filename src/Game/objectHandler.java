package Game;

import java.util.ArrayList;

public class objectHandler {
	static ArrayList<Object> objects = new ArrayList<>();
	
	static public void putInArraylist(Object item) {
		if(item.getName().equals(Map.roomGotObject(TextHandlerDirection.currentLocation))){
			objects.add(item);
			Map.releaseObject(TextHandlerDirection.currentLocation);
			System.out.println("You put a " + item.getName() + " in your inventory");
		} else {
			System.out.println("There is no " + item.getName() + " over here");
		}
	}
	
	static public void getItemOutFromArraylist(Object item) {
		if(!Map.checkGotObject(TextHandlerDirection.currentLocation)) {
			objects.remove(item); 
			Map.putObjectInRoom(TextHandlerDirection.currentLocation, item);
			System.out.println("You dropped your " + item.getName() + " in this room");
		} else {
			System.out.println("There is allready a " + Map.roomGotObject(TextHandlerDirection.currentLocation) + " over here. It's full"); 
		}
	}
	
	static public void getItemOutOfMap(Object item) {
		objects.remove(item);
	}
	
	static boolean checkIfObjectIsInInv(Object item) {
		int i = 0;
		for(Object val : objectHandler.objects) 
			if(val.getName().equals(item.getName())) {
				i++;
			} 
		if(i>0) {
			return true;
		} return false;
	}
}
