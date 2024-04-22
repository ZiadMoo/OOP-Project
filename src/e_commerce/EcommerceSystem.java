package e_commerce;

import java.util.Scanner;

public class EcommerceSystem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ElectronicProduct p1 = new ElectronicProduct("smartPhone", 1, 599.99f, "Samsung", 1);
        ClothingProduct p2 = new ClothingProduct("T-shirt", 2, 19.99f, "Medium", "Cotton");
        BookProduct p3 = new BookProduct("OOP", 3, 39.99f, "O’Reilly", "X Publications");
        System.out.println("Welcome to the E-Commerce System!\nPlease enter your id");
        int id = Math.abs(in.nextInt());
        System.out.println("Please Enter your name");
        in.nextLine();
        String name = in.nextLine();
        System.out.println("Please Enter your address");
        String address = in.nextLine();
        Customer c1 = new Customer(id, name, address);
        System.out.println("How many Products you want to add to your cart?");
        int nproducts = in.nextInt();
        Cart ca = new Cart(id, nproducts);
        for (int i = 0; i < nproducts; i++) {
            System.out.println("Which product would you like to add ? 1- SmartPhone 2- T-Shirt 3- OOP");
            int option = in.nextInt();
            switch (option) {
                case 1:
                    ca.addProduct(p1, i);
                    break;
                case 2:
                    ca.addProduct(p2, i);
                    break;
                case 3:
                    ca.addProduct(p3, i);
                    break;
                default:
                    System.out.println("Invalid Number.");
            }
        }
        System.out.println("Your total is $" + ca.CalculatePrice() + " Would you like to place the order? 1-Yese 2-No");
        int q = in.nextInt();
        if (ca.placeOrder(q)) {
            Order o1 = new Order(id, 1, ca.CalculatePrice());
            o1.Products = ca.Products;
            System.out.println("Here's your order's summary:");
            o1.printOrderInfo();
        } else {
            System.out.println("Your order is not placed.\nThank you.");
        }

    }

}
