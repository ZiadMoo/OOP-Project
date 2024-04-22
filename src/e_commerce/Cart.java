package e_commerce;

public class Cart {

   private int customerId;
   private int nProducts;
    Product Products[];

    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.Products = new Product[nProducts];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProduct(int nProduct) {
        this.nProducts = Math.abs(nProduct);
    }

    public void addProduct(Product p, int index) {
        if (Products[nProducts - 1] != null) {
            System.out.println("The cart is full.");
        } else {
            Products[index] = p;
        }
    }

    public void removeProduct(int n) {
        if (n <= Products.length) {
            Products[n - 1] = null;
        } else {
            System.out.println("Invalid number.");
        }
    }

    public float CalculatePrice() {
        float sum = 0;
        for (int i = 0; i < Products.length; i++) {
            sum += Products[i].price;

        }
        return sum;

    }

    public boolean placeOrder(int x) {
        if (x == 1) {
            return true;
        } else {
            return false;
        }

    }

}
