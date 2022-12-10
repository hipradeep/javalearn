package practice.arvind;

public class ArvindClass {

    public static void main(String[] args) {

        Bulb rBulb=new Bulb();
        rBulb.bName="Alpha";
        rBulb.color="red";
        rBulb.watt=100;
        rBulb.eDate="2023";

        Bulb yBulb=new Bulb();
        yBulb.bName="Bita";
        yBulb.color="yellow";
        yBulb.watt=90;
        yBulb.eDate="2024";
        yBulb.phase=3;

        Bulb gBulb=new Bulb(80, "Green", "leetcode/Gama", "2025", 2);

        System.out.println(gBulb.bName);
        System.out.println(gBulb.getWatt());




    }
}

//class is blueprint of obj

class Bulb{
    int watt;
    String color;
    String bName;
    String eDate;
    int phase;

    //constructor usd to initialised class variables
    public Bulb(int watt, String color, String bName, String eDate, int phase) {
        this.watt = watt;
        this.color = color;
        this.bName = bName;
        this.eDate = eDate;
        this.phase = phase;
    }
    public Bulb(int watt, String color, String bName, String eDate) {
        this.watt = watt;
        this.color = color;
        this.bName = bName;
        this.eDate = eDate;
    }

    public Bulb() {
    }

    public int getWatt(){
        return this.watt;
    }
}
