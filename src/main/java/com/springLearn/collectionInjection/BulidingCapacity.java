package com.springLearn.collectionInjection;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class BulidingCapacity {

    private List<String> roomList ;

    private Set<Integer> RoomNumbers ;

    private Map<Integer,String>  Staff;

    public BulidingCapacity(List roomList, Set roomNumbers, Map staff) {
        this.roomList = roomList;
        RoomNumbers = roomNumbers;
        Staff = staff;
    }


    public BulidingCapacity()
    {   }

    public Set getRoomNumbers() {
        return RoomNumbers;
    }

    public void setRoomNumbers(Set roomNumbers) {
        RoomNumbers = roomNumbers;
    }

    public Map getStaff() {
        return Staff;
    }

    public void setStaff(Map staff) {
        Staff = staff;
    }



    public List getRoomList() {
        return roomList;
    }
    public void setRoomList(List roomList) {
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "BulidingCapacity{" +
                "roomList=" + roomList +
                ", RoomNumbers=" + RoomNumbers +
                ", Staff=" + Staff +
                '}';
    }

}
