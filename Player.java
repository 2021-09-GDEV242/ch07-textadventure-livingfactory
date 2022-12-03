import java.util.ArrayList;

/**
 * The main player for the super text adventure
 *
 * @author David Yager
 * @version v1.1
 */
public class Player
{
    // instance variables - replace the example below with your own
    private Room currentRoom;
    private String name;
    private Item item;
    public static final int MAX_INV_WEIGHT = 1500;
    private int invWeight;
    private ArrayList<Item> items;
    
    
    /**
     * Takes the item from the current room.
     * @param item 
     */
    public void takeItem(Item item){
        items.add(item);
        invWeight+= item.getWeight();
    }
    
    /**
     * Returns the current item.
     * @returns the current item.
     */
    public Item getItem(){ 
        return item;
    }


    
    /**
     * Drops the item in the current room.
     */
    public void dropItem(){
        System.out.println(item + " dropped");
        this.item = null;
    }
    
    /**
     * Constructor for player.
     * @param name The name of the player
     * @param startingRoom The selected starting room
     */
    public Player(String name, Room startingRoom){
        this.name = name;
        this.currentRoom = startingRoom;
        items = new ArrayList<>();
        invWeight = 0;
    }
    
    /**
     * Sets current room.
     * @param currentRoom the room to enter.
     */
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
    
    /**
     * Returns current room when called.
     * @returns Current room.
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }
    
    /**
     * Returns inventory weight when called.
     * @returns Inventory weight.
     */
    public int getInventoryWeight() {
        return invWeight;
    }
    
    /**
     * Returns name when called.
     * @returns The name of the room.
     */
    public String getName() {
        return name;
    }
}
