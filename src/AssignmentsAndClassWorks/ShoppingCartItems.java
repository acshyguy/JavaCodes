package AssignmentsAndClassWorks;

public class ShoppingCartItems {
    private String items;
    private double price;
    private int quantity;
    private int amountPaid;

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }



    public ShoppingCartItems(String items, double price, int quantity) {
        this.items = items;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItems() {
        return items;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}
