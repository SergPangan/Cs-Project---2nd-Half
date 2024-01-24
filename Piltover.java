import java.util.ArrayList;

public class Piltover extends Region{
        String name;
         private static ArrayList<Item> piltoverShop = new ArrayList<>();

        public Piltover(String q){
            super(q);
        }
        @Override
        public void addItem(Item n){
            if(!piltoverShop.contains(n)){
            piltoverShop.add(n);
            System.out.println(n.getName() + " has been added.");
            super.addItem(n);
            }
            else{
                System.out.println("Piltover shop already contains " + n.getName());
            }
        }
        @Override
        public void removeItem(Item n){
            if(piltoverShop.contains(n)){
            piltoverShop.remove(n);
            System.out.println(n.getName() + " has been removed.");
            super.removeItem(n);
            }
            else if(!piltoverShop.contains(n)){
                System.out.println(n.getName() + " is not in the shop");
            }
        }

        @Override
        public void displayItems() {
            for (Item item : piltoverShop){
                System.out.println(item.getName() + " worth: " + item.getCost() + " gold.");
            }
        }
}
