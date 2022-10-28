package FinalExam.models;

public class ChinhHang extends Mobile {
    private int warrantyDay;
    private String warrantyZone;

    public ChinhHang() {
    }

    public ChinhHang(int id, String name, int price, int amount, String producer, int warrantyDay, String warrantyZone) {
        super(id, name, price, amount, producer);
        this.warrantyDay = warrantyDay;
        this.warrantyZone = warrantyZone;
    }

    public int getWarrantyDay() {
        return warrantyDay;
    }

    public void setWarrantyDay(int warrantyDay) {
        this.warrantyDay = warrantyDay;
    }

    public String getWarrantyZone() {
        return warrantyZone;
    }

    public void setWarrantyZone(String warrantyZone) {
        this.warrantyZone = warrantyZone;
    }

    @Override
    public String toString() {
        return super.toString()+ warrantyDay+","+warrantyZone + ","+getClass().getSimpleName();
    }
}
