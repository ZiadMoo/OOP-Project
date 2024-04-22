## Project Structure
The project consists of the following classes:

1. **Product**
   - Superclass representing a generic product.
   - Attributes: productId (positive integer), name (String), price (positive float).
   - Methods: Setters and getters for attributes.

2. **ElectronicProduct**
   - Subclass of Product representing electronic products.
   - Attributes: brand (String), warrantyPeriod (positive integer).
   - Methods: Setters and getters for attributes.

3. **ClothingProduct**
   - Subclass of Product representing clothing products.
   - Attributes: size (String), fabric (String).
   - Methods: Setters and getters for attributes.

4. **BookProduct**
   - Subclass of Product representing book products.
   - Attributes: author (String), publisher (String).
   - Methods: Setters and getters for attributes.

5. **Customer**
   - Represents a customer.
   - Attributes: customerId (positive integer), name (String), address (String).
   - Methods: Setters and getters for attributes.

6. **Cart**
   - Represents a shopping cart.
   - Attributes: customerId (positive integer), nProducts (positive integer), products (array of Product objects).
   - Methods: Setters and getters for attributes, addProduct, removeProduct, calculatePrice, placeOrder.

7. **Order**
   - Represents an order placed by a customer.
   - Attributes: customerId (positive integer), orderId (positive integer), products (array of Product objects), totalPrice (positive float).
   - Methods: printOrderInfo.

8. **EcommerceSystem**
   - Entry point for the project, contains main method and demonstrates the usage of other classes.

