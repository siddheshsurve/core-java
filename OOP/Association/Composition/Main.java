package OOP.Association.Composition;

import java.util.*;

class Room {
    String roomName;
    int roomNo;
    Room(String roomName, int roomNo) {
        this.roomName = roomName;
        this.roomNo = roomNo;
    }
}

class House {
    private final List<Room> rooms;
    House(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> getTotalRoomsInHouse() {
        return rooms;
    }
}

class Main {
    public static void main(String[] args) {
        Room r1 = new Room("Living Room", 1);
        Room r2 = new Room("Bed Room", 2);
        Room r3 = new Room("Kitchen", 3);
    }
}