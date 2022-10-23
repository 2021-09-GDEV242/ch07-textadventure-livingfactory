
/**
 * Items can now be found in rooms. Each item has a description and weight.
 * 
 * This class creates items and their properties.
 */
public class Item
{
    private String description;
    private String weight;

    public Item(String description, String weight){
        this.description = description; 
        this.weight = weight;
    }
    
    public String getItemInfo() {
        if(description.equals(""))
            return "";
        return description + ", Weight: " + weight;
    }
}
