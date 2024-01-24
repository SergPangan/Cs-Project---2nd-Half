public class Ionian extends Summoner{
    String name;
    int AP, AD, MS, Vamp, Lethal, HP, Pen, Armor, MR, bounty;
    int fee = 10;

    public Ionian(String q, int b){
        super(q, "ionia", b);
    }

    @Override
    public void buyItem(Item n){ 
        int itemCost = n.getCost();   
        if(bounty >= itemCost){      
        super.buyItem(n);
        if(bounty >= 10){
            System.out.println("10 gold was allocated to the originality fee.");
            bounty -= 10;
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

