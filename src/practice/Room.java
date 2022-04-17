package practice;

import java.util.Scanner;

public class Room {
    //17. Write a program to create a room class, the attributes of this class is roomno,
    // roomtype, roomarea and ACmachine. Inthis class the member functions are setdata and displaydata.
    private int roomno;
    private String roomType;
    private int roomArea;
    private String  AcMachine;

    void setData(){
        System.out.println("Enter details ");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter room number : ");
        roomno= sc.nextInt();;
        System.out.print("Enter room type : ");
        roomType=sc.next();
        System.out.print("Enter room area : ");
        roomArea=sc.nextInt();
        System.out.print("is AC Machine available : ");
        AcMachine=sc.next();
    }
    void display(){
        System.out.println(
                "Room details : "+
                        "\n RoomNo - "+ roomno+
                        "\n Room Type  - "+ roomType+
                        "\n Room Area  - "+ roomArea+
                        "\n is AC Machine available  - "+ AcMachine

        );
    }

    public static void main(String[] args) {
        Room room=new Room();
        room.setData();
        room.display();
    }
}
