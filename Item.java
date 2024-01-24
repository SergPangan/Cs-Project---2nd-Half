
public class Item {
    private String name, desc, champ;
    private int AP, AD, MS, Vamp, Lethal, HP, Pen, Armor, MR, cost;

    public Item(String q, String z, String c, int r, int s, int t, int u, int v, int w, int x, int y, int b){
        name = q;
        desc = z;
        champ = c;
        AD = r;
        AP = s;
        MS = t;
        Vamp = u;
        Lethal = u;
        HP = v;
        Pen = w;
        Armor = x;
        MR = y;
        cost = b;
    }

    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }
    public String getChamp(){
        return champ;
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
    public int getCost(){
        return cost;
    }

    public void displayItemStats(){
        System.out.println(name + "'s stats are: HP - " + HP + ", AP - " + AP + ", AD - " + AD + ", Vamp - " + Vamp + ", Lethal - " + Lethal + ", MS - " + MS + ", Pen - " + Pen + ", Armor - " + Armor + ", MR - " + MR);
    }
    public void displayCost(){
        System.out.println(name + "'s cost is " + cost + " gold.");
    }
    public void displayDesc(){
        System.out.println(name + "'s description is " + desc);
    }
    public void displayChamps(){
        System.out.println("Recommended champions for " + name + " are " + champ);
    }
}
