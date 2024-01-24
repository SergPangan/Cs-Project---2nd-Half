import java.util.ArrayList;

public class Summoner {
    private String name, region;
    private int AP, AD, MS, Vamp, Lethal, HP, Pen, Armor, MR, bounty;
    private static ArrayList<Item> catalog = new ArrayList<>();

    public Summoner(String q, String r, int b){
        name = q;
        region = r;
        AD = 0;
        AP = 0;
        MS = 0;
        Vamp = 0;
        Lethal = 0;
        HP = 0;
        Pen = 0;
        Armor = 0;
        MR = 0;
        bounty = b;
    }

    public String getName(){
        return name;
    }
    public String getRegion(){
        return region;
    }
    public int getAP(){
        return AP;
    }
    public int getAD(){
        return AD;
    }
    public int getMS(){
        return MS;
    }
    public int getVamp(){
        return Vamp;
    }
    public int getLethal(){
        return Lethal;
    }
    public int getHP(){
        return HP;
    }
    public int getPen(){
        return Pen;
    }
    public int getArmor(){
        return Armor;
    }
    public int getMR(){
        return MR;
    }
    public int getBounty(){
        return bounty;
    }
    public static ArrayList<Item> getCatalog() {
        return catalog;
    }
    
    public void buyItem(Item n){
        int itemCost = n.getCost();
        if(bounty >= itemCost){
            bounty -=itemCost;
            catalog.add(n);
            System.out.println(n.getName() + " has been bought.");
            AD += n.getAD();
            AP += n.getAP();
            Vamp += n.getVamp();
            Lethal += n.getLethal();
            MS += n.getMS();
            Pen += n.getPen();
            Armor += n.getArmor();
            MR += n.getMR();
            HP += n.getHP();
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
    public void sellItem(Item n){
        int itemCost = n.getCost();
        if(catalog.contains(n)){
            bounty += itemCost;
            catalog.remove(n);
            System.out.println(n.getName() + " has been sold.");
            AD -= n.getAD();
            AP -= n.getAP();
            Vamp -= n.getVamp();
            Lethal -= n.getLethal();
            MS -= n.getMS();
            Pen -= n.getPen();
            Armor -= n.getArmor();
            MR -= n.getMR();
            HP -= n.getHP();
        }
        else{
            System.out.println("The Item is not in your catalog");
        }
    }
    public void displayStats(){
        System.out.println(name + "'s stats are: HP - " + HP + ", AP - " + AP + ", AD - " + AD + ", Vamp - " + Vamp + ", Lethal - " + Lethal + ", MS - " + MS + ", Pen - " + Pen + ", Armor - " + Armor + ", MR - " + MR);
    }
    public void displayBalance(){
        System.out.println(name + "'s bounty is " + bounty + " gold.");
    }
}
