import java.util.ArrayList;

public class Shurima extends Region{
        String name;
        private static ArrayList<Item> shurimaShop = new ArrayList<>();

        public Shurima(String q){
            super(q);
        }
        @Override
        public void addItem(Item n){
            if(!shurimaShop.contains(n)){
            shurimaShop.add(n);
            System.out.println(n.getName() + " has been added.");
            super.addItem(n);
            }
            else{
                System.out.println("Shurima shop already contains " + n.getName());
            }
        }
        @Override
        public void removeItem(Item n){
            if(shurimaShop.contains(n)){
            shurimaShop.remove(n);
            System.out.println(n.getName() + " has been removed.");
            super.removeItem(n);
            }
            else if(!shurimaShop.contains(n)){
                System.out.println(n.getName() + " is not in the shop");
            }
        }

        @Override
        public void displayItems() {
            for (Item item : shurimaShop){
                System.out.println(item.getName() + " worth: " + item.getCost() + " gold.");
            }
        }

}
