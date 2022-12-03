
/**
 * Items can be found in rooms. Each item has a description and weight.
 * This class contains the info to create items and their properties.
 * 
 * @author  David Yager
 * @version v1.1
 */
public class Item
{
    private String description;
    private int weight;
    
    /**
    * Create an item described "description" and weighted 0
    * "description" is something like "medicine" or "lighter".
    * @param description The item's description.
    * @param weight The item's weight
    */
    public Item(String description, Integer weight){
        this.description = description; 
        this.weight = weight;
    }
    
    /**
    * Return the item's info
    * @returns a string containing information about the item
    */
    public String getItemInfo() {
        if(description.equals(""))
            return "";
        return description + ", Weight: " + weight;
    }

    /**
    * Return the item's weight.
    * @returns weight The item's weight
    */
    public int getWeight(){
        return weight;
    }
}
