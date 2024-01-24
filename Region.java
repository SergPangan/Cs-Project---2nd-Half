import java.util.ArrayList;

public class Region {
    private String name;
    private static ArrayList<Item> worldShop = new ArrayList<>();

    public Region(String q){
        name = q;
    }
    public String getName(){
        return name;
    }
    
    public void addItem(Item n){
        worldShop.add(n);
        System.out.println(n.getName() + " has been added to the world shop.");
    }

    public void removeItem(Item n){
        if(worldShop.contains(n)){
        worldShop.remove(n);
        System.out.println(n.getName() + " has been removed from the world shop.");
        }
        else if(!worldShop.contains(n)){
            System.out.println(n.getName() + " is not in the world shop");
        }
    }
    
    public void displayItems() {
        for (Item item : worldShop){
            System.out.println(item.getName() + " worth: " + item.getCost() + " gold.");
        }
    }
}
