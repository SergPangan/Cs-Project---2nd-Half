public class Main {
    public static void main(String[] args){
        Summoner gusion = new Shuriman("gusion", 100000);
        Summoner helcurt = new Piltgenius("helcurt", 3000);
        Summoner thamuz = new Ionian("thamuz", 3000);

        Region worldShop = new Region("World shop");
        Region shurimaShop = new Shurima("shurima");
        Region piltoverShop = new Piltover("piltover");
        Region ioniaShop = new Ionia("ionia");

        Item gunBlade = new Item("Gun Blade","zzz","katarina", 1, 2, 3, 4, 5, 6, 7, 8, 1000);
        Item deathBlade = new Item("Death Blade","haha","katarina", 3, 3, 3, 3, 3, 3, 3, 3, 2000);
        Item zhonya = new Item("Zhonya","You become Invulnrable","katarina", 8, 7, 6, 5, 4, 3, 2, 1, 3000);
        
        //Adding of Items - there can only be one copy in item per region shop
        System.out.println("Shurima adds gun blade to their stores");
        shurimaShop.addItem(gunBlade);
        System.out.println("Shurima adds gun blade to their stores");
        shurimaShop.addItem(gunBlade);
        System.out.println("Shurima adds death blade to their stores");
        shurimaShop.addItem(deathBlade);
        System.out.println("Piltover adds gun blade to their stores");
        piltoverShop.addItem(gunBlade);
        System.out.println("Piltover adds zhonya to their stores");
        piltoverShop.addItem(zhonya);
        System.out.println("Ionia adds death blade to their stores");
        ioniaShop.addItem(deathBlade);
        System.out.println("Ionia adds zhonya to their stores");
        ioniaShop.addItem(zhonya);

        //Removal of Items
        System.out.println("Shurima removes gun blades from their stores");
        shurimaShop.removeItem(gunBlade);
        System.out.println("Shurima removes zhonya from their stores");
        shurimaShop.removeItem(zhonya);
        System.out.println("Piltover removes zhonya from their stores");
        piltoverShop.removeItem(zhonya);

        //Item Display
        System.out.println("Shurima shop's Items: ");
        shurimaShop.displayItems();
        System.out.println("Piltover shop's Items: ");
        piltoverShop.displayItems();
        System.out.println("Ionia shop's Items: ");
        ioniaShop.displayItems();
        System.out.println("World's items: "); //World shop only displays items from all the shops, summoner cannot buy from world shop. 
        worldShop.displayItems();

        //Buying items
        System.out.println("Gusion buys zhonya");
        gusion.buyItem(zhonya);
        System.out.println("Gusion buys gun blade");
        gusion.buyItem(gunBlade);
        System.out.println("Helcurt buys gun blade");
        helcurt.buyItem(gunBlade);
        System.out.println("Helcurt buys death blade");
        helcurt.buyItem(deathBlade);
        System.out.println("Thamuz buys gun blade");
        thamuz.buyItem(gunBlade);


        //Selling items
        System.out.println("Gusion sells zhonya");
        gusion.sellItem(zhonya);
        System.out.println("Helcurt sells zhonya");
        helcurt.sellItem(zhonya);
        System.out.println("Thamuz sells gun blade");
        thamuz.sellItem(gunBlade);
        

        //Stat display for summoners
        System.out.println("Gusion Displays stats");
        gusion.displayStats();
        System.out.println("Helcurt Displays stats");
        helcurt.displayStats();
        System.out.println("Thamuz Displays stats");
        thamuz.displayStats();

        //Balance display for summoners
        System.out.println("Gustion displays bounty");
        gusion.displayBalance();
        System.out.println("Helcurt displays bounty");
        helcurt.displayBalance();
        System.out.println("Thamuz displays bounty");
        thamuz.displayBalance();


        //Stat display for Items
        System.out.println("Zhonya stats");
        zhonya.displayItemStats();
        System.out.println("Death blade stats");
        deathBlade.displayItemStats();
        System.out.println("Gun blade stats");
        gunBlade.displayItemStats();

        //Cost display for Items
        System.out.println("Zhonya cost");
        zhonya.displayCost();
        //Description display for items
        System.out.println("Death blade description");
        deathBlade.displayDesc();
        //Recommended champions for items
        System.out.println("Gun blade recommended champions");
        gunBlade.displayChamps();
        }
    }    
