package com.springLearn.concepts.setter;

public class room {

    private String roomName;
    private int roomNumber;
    private String roomType;


    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public room(String roomName, int roomNumber, String roomType) {
        this.roomName = roomName;
    }

    public room() {
    }

    @Override
    public String toString() {
        return "room{" +
                "roomName='" + roomName + '\'' +
                ", roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                '}';
    }
}
