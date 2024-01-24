public class Shuriman extends Summoner{
    String name;
    int AP, AD, MS, Vamp, Lethal, HP, Pen, Armor, MR, bounty;

    public Shuriman(String q, int b){
        super(q, "shurima", b);
    }

    @Override
    public void buyItem(Item n){ 
        int itemCost = n.getCost();   
        if(bounty >= itemCost){      
        super.buyItem(n);
        if(bounty >= 20){
            System.out.println("20 gold was allocated to the originality fee.");
            bounty -= 20;
        }
        else{
            System.out.println("Item is fake.");
        }
    }
        else{
            super.buyItem(n);
        }

}
}
