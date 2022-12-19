package model;

public class Room {
    private int id;
    private String name;
    private int phone;
    private String date;
    private int idPayment_room;
    private String note;

    public Room() {
    }

    public Room(int id, String name, int phone, String date, int idPayment_room, String note) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.idPayment_room = idPayment_room;
        this.note = note;
    }
    public Room( String name, int phone, String date, int idPayment_room, String note) {
        this.name = name;
        this.phone = phone;
        this.date = date;
        this.idPayment_room = idPayment_room;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getIdPayment_room() {
        return idPayment_room;
    }

    public void setIdPayment_room(int idPayment_room) {
        this.idPayment_room = idPayment_room;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
