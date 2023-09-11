package lk.ijse.dep11.tm;

import java.io.Serializable;

public class cartitem implements Serializable {
    private String code;
    private String description;
    private int qty;
    private double price;
    private double total;

    public cartitem(String code, String description, int qty, double price, double total) {
        this.code = code;
        this.description = description;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }

    public cartitem(){

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
