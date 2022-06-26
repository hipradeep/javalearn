package dacclass.april.apr28;

public class Door {
    float height, width;

    public Door(float height, float width) {
        this.height = height;
        this.width = width;
    }

    void display(){

        System.out.println("Door " +
                "height : " +height+
                "width : " +width+
                "");
    }
}

class House{
    String address;
    Door door;

    public House(String address, Door door) {
        this.address = address;
        this.door = door;
    }
    void display(){
        door.display();
        System.out.println("Address - " + address);

    }

    public static void main(String[] args) {
        House house=new House("Lucknow", new Door(25.3f, 56.2f));
        house.display();


    }
}