package Game;

public class Room {
	
	private String name;
	private String gotCreature;
	private String gotObject;
	
		Room(String name, String gotCreature, String gotObject) {
			this.name = name;
			this.gotCreature = gotCreature;
			this.gotObject = gotObject;
		}
		
		public String getName() {
			return this.name;
		}
		
		public String getGotCreature() {
			return this.gotCreature;
		}
		
		public void releaseCreature() {
			this.gotCreature = "";
		}
		
		public void putCreatureInRoom(Creature creature) {
			this.gotCreature = creature.getName();
		}
		
		public boolean checkGotObject() {
			if(this.gotObject != ""){
				return true;
			} else {
				return false;
			}
		}
		
		public String getGotObject() {
			return this.gotObject;
		}
		
		public void releaseObject() {
			this.gotObject = "";
		}
		
		public void putObjectInRoom(Object object) {
			this.gotObject = object.getName();
		}
}
