public class Main {

    public static void calculateDiscount(double price, int discountAmount, String productName) {


        double discountPercentage = discountAmount / 100.0;

        double priceDiscounted = price * discountPercentage;

        double finalPrice = price - priceDiscounted;

        System.out.println( productName + finalPrice);
    }


    public static void main(String[] args) {

        calculateDiscount(100.00, 20, "gucci"); calculateDiscount(200.00, 23,"prada" );
    }
}