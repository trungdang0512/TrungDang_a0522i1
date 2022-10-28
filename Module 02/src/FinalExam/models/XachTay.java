package FinalExam.models;

public class XachTay extends Mobile {
    private String fromCountry;
    private String status;

    public XachTay() {
    }

    public XachTay(int id, String name, int price, int amount, String producer, String fromCountry, String status) {
        super(id, name, price, amount, producer);
        this.fromCountry = fromCountry;
        this.status = status;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString()+ fromCountry+","+status + ","+getClass().getSimpleName();
    }
}
