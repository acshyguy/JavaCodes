package Chapter3Ex;

public class Ex313Car {

    public String model;
    public String year;
    public double price;

    public Ex313Car() {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }
    }

    public void discount(double discountAmount){
        if (price > 0){
            this.price = price - (price * discountAmount/100) ;
        }
    }

}
