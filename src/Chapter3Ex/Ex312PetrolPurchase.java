package Chapter3Ex;

public class Ex312PetrolPurchase {

    public String location;
    public String petrolType;
    public int liters;
    public double price;
    public  double discount;

    public Ex312PetrolPurchase(String location,String fuel,int liters,double price,double discount) {
        this.location = location;
        petrolType = fuel;
        this.liters = liters;
        this.price = price;
        this.discount = discount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getLiters() {
        return liters;
    }

    public void setLiters(int liters) {
        this.liters = liters;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPurchaseAmount() {
        double netPurchaseAmount = liters * price - discount;
        return netPurchaseAmount;
    }
}
