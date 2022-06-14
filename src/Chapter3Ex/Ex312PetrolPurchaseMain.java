package Chapter3Ex;

public class Ex312PetrolPurchaseMain {
    public static void main(String[] args) {

        Ex312PetrolPurchase petrol = new Ex312PetrolPurchase("Lagos",
                "fuel",2,200,5);

        System.out.println("Location is: "+petrol.getLocation());

        System.out.println("Petrol type is: "+petrol.getPetrolType());

        System.out.println("Number of litter is: "+petrol.getLiters());

        System.out.println("Amount is: "+petrol.getPrice());

        System.out.println("Discounted amount: "+petrol.getDiscount());
    }


}
