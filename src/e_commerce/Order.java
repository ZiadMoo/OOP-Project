    package e_commerce;

    public class Order {

       private int orderId;
       private int customerId;
       private float totalPrice;
        Product Products[];

        public Order(int customerId, int orderId, float totalPrice) {
            this.customerId = Math.abs(customerId);
            this.orderId = Math.abs(orderId);
            this.totalPrice = Math.abs(totalPrice);
        }

        public void printOrderInfo() {
            System.out.println("OrderId : " + orderId + "\nCustomer ID " + customerId + "\nProducts : ");
            for (int i = 0; i < Products.length; i++) {
                if (Products[i] == null) {
                    continue;
                } else {
                    System.out.println(Products[i].name + " - $" + Products[i].price);
                }
            }
            System.out.println("Total Price: $" + totalPrice);

        }
    }
