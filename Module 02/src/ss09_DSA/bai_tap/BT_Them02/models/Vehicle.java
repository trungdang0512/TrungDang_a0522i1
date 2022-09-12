package ss09_DSA.bai_tap.BT_Them02.models;

import java.util.Objects;

public abstract class Vehicle {
    String bienKiemSoat;
    String hangSanXuat;
    String namSanXuat;
    String chuSoHuu;

    public Vehicle() {
    }

    public Vehicle(String bienKiemSoat){
        this.bienKiemSoat = bienKiemSoat;
    }

    public Vehicle(String bienKiemSoat, String hangSanXuat, String namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat='" + namSanXuat + '\'' +
                ", chuSoHuu='" + chuSoHuu + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(bienKiemSoat, vehicle.bienKiemSoat);
    }

//    @Override
//    public int hashCode() {
//        return 0;
//    }
//    public abstract void addNewVehicle();
//    public abstract void displayVehicleList();
//    public abstract void deleteVehicle(String inputID);
//    public abstract void findVehicle(String inputID);
}
