package e_commerce;

public class Product {

   protected String name;
   protected int productId;
   protected float price;

    public Product(String name, int productId, float price) {
        this.name = name;
        this.productId = Math.abs(productId);
        this.price = Math.abs(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = Math.abs(productId);
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = Math.abs(price);
    }
}
