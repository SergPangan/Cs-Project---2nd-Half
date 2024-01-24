import java.util.ArrayList;

public class Ionia extends Region{
    String name;
     private static ArrayList<Item> ioniaShop = new ArrayList<>();

    public Ionia(String q){
        super(q);
    }
    @Override
        public void addItem(Item n){
            if(!ioniaShop.contains(n)){
            ioniaShop.add(n);
            System.out.println(n.getName() + " has been added.");
            super.addItem(n);
            }
            else{
                System.out.println("Ionia shop already contains " + n.getName());
            }
        }
        @Override
        public void removeItem(Item n){
            if(ioniaShop.contains(n)){
            ioniaShop.remove(n);
            System.out.println(n.getName() + " has been removed.");
            super.removeItem(n);
            }
            else if(!ioniaShop.contains(n)){
                System.out.println(n.getName() + " is not in the shop");
            }
        }

        @Override
        public void displayItems() {
            for (Item item : ioniaShop){
                System.out.println(item.getName() + " worth: " + item.getCost() + " gold.");
            }
        }
}
