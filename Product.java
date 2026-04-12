// Create a product class with private varoables and getter / settter methode
class Product {
    // Private variables
    private int productId;
    private String productName;
    private double price;

    // Setter methods
    public void setProductId(int id) {
        productId = id;
    }

    public void setProductName(String name) {
        productName = name;
    }

    public void setPrice(double p) {
        price = p;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Product p1 = new Product();

        // Setting values using setters
        p1.setProductId(101);
        p1.setProductName("Laptop");
        p1.setPrice(50000);

        // Getting values using getters
        System.out.println("Product ID: " + p1.getProductId());
        System.out.println("Product Name: " + p1.getProductName());
        System.out.println("Price: " + p1.getPrice());
    }
}