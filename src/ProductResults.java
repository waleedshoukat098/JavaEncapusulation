class ProductDetails {
    private String prodName;
    private double prodPrice;

    ProductDetails(String prodName, double prodPrice) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public String setProdName(String prodName) {
        this.prodName = prodName;
        return prodName;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdPrice(double prodPrice) {
        if (prodPrice > 0) {
            this.prodPrice = prodPrice;
        }
    }

    public double getProdPrice() {
        return prodPrice;
    }
}

public class ProductResults {
    public static void main(String[] args) {
        ProductDetails productDetails = new ProductDetails("Horse", 40000.0);
        System.out.println("Before Updating price is =>" + productDetails.getProdPrice());
        String name = productDetails.setProdName("Android Gradle");

        productDetails.setProdPrice(200000.0);
        System.out.println("The Product  name is =>" + name);
        System.out.println("Thee product price is=>" + productDetails.getProdPrice());


    }
}