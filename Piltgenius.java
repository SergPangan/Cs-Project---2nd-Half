public class Piltgenius extends Summoner{
    String name;
    int AP, AD, MS, Vamp, Lethal, HP, Pen, Armor, MR, bounty;
    int fee = 30;

    public Piltgenius(String q, int b){
        super(q, "piltover", b);
    }

    @Override
    public void buyItem(Item n){ 
        int itemCost = n.getCost();   
        if(bounty >= itemCost){      
        super.buyItem(n);
        if(bounty >= 100){
            System.out.println("100 gold was allocated to the originality fee.");
            bounty -= 100;
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

