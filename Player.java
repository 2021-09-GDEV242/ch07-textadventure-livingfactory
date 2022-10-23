import java.util.ArrayList;

/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
     */
    public Player(String name, Room startingRoom){
        this.name = name;
        this.currentRoom = startingRoom;
        items = new ArrayList<>();
        invWeight = 0;
    }
    
    /**
     * Sets current room.
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
     * @returns Name.
     */
    public String getName() {
        return name;
    }
}
