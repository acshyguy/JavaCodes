package Chapter3Ex;


class Ex313CarTest {
    public static void main(String[] args) {
        Ex313Car benz = new Ex313Car();
        benz.setPrice(300);
        benz.setModel("g-wagon");
        benz.setYear("2022");
        System.out.println("Benz price is: "+benz.getPrice());
        System.out.println("Benz model is: "+benz.getModel());
        System.out.println("Benz year is: "+benz.getYear());
        //System.out.printf("%s\n%f\n%s", benz.getModel(),benz.getPrice(),benz.getYear());
        benz.discount(5);
        System.out.println("Benz discounted price: "+benz.getPrice());

        System.out.println("");

        Ex313Car toyota = new Ex313Car();
        toyota.setPrice(150);
        toyota.setModel("camry");
        toyota.setYear("2022");
        System.out.println("Toyota price is: "+toyota.getPrice());
        System.out.println("Toyota model is: "+toyota.getModel());
        System.out.println("Toyota year is: "+toyota.getYear());
        toyota.discount(7);
        System.out.println("Discounted price is: "+toyota.getPrice());
//        Ex313Car toyota = new Ex313Car("Camry","2022", -150);
//        toyota.setPrice(-150);
//        System.out.println("Toyota "+toyota.getPrice());
    }


}