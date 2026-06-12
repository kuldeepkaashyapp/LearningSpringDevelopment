package com.springLearn.concepts.setter;

public class ClassRoom {
    private room Room;

    public ClassRoom(room Room) {
        this.Room = Room;
    }

    public void setRoom(room room) {
        Room = room;
    }
    public room getRoom() {
        return Room;
    }

    public  ClassRoom() {

    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "Room=" + Room +
                '}';
    }
}
