package com.example.tuong.model;

/**
 * Created by tuong on 12/10/2017.
 */

public class coffeeTable {
    private String NameTable;
    private Boolean HavePeople;
    private Boolean EmplyTable;
    private Boolean SeatReservation;
    private Boolean Labourer;

    public coffeeTable() {
    }

    public coffeeTable(String nameTable, Boolean havePeople, Boolean emplyTable, Boolean seatReservation, Boolean labourer) {
        NameTable = nameTable;
        HavePeople = havePeople;
        EmplyTable = emplyTable;
        SeatReservation = seatReservation;
        Labourer = labourer;
    }

    public String getNameTable() {
        return NameTable;
    }

    public void setNameTable(String nameTable) {
        NameTable = nameTable;
    }

    public Boolean getHavePeople() {
        return HavePeople;
    }

    public void setHavePeople(Boolean havePeople) {
        HavePeople = havePeople;
    }

    public Boolean getEmplyTable() {
        return EmplyTable;
    }

    public void setEmplyTable(Boolean emplyTable) {
        EmplyTable = emplyTable;
    }

    public Boolean getSeatReservation() {
        return SeatReservation;
    }

    public void setSeatReservation(Boolean seatReservation) {
        SeatReservation = seatReservation;
    }

    public Boolean getLabourer() {
        return Labourer;
    }

    public void setLabourer(Boolean labourer) {
        Labourer = labourer;
    }
}
