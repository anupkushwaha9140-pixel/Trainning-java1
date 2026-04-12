// create ProductBilling class and implement overloed method for 1, 2 and 3 products
class ProductBilling {

    // Billing for 1 product
    void bill(int price1) {
        int total = price1;
        System.out.println("Total for 1 product: " + total);
    }

    // Billing for 2 products
    void bill(int price1, int price2) {
        int total = price1 + price2;
        System.out.println("Total for 2 products: " + total);
    }

    // Billing for 3 products
    void bill(int price1, int price2, int price3) {
        int total = price1 + price2 + price3;
        System.out.println("Total for 3 products: " + total);
    }

    public static void main(String[] args) {
        ProductBilling pb = new ProductBilling();

        pb.bill(100);                 // 1 product
        pb.bill(100, 200);            // 2 products
        pb.bill(100, 200, 300);       // 3 products
    }
}
