package strategy;

public class ClientTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        Product product1=new Product("Rice","99994",100);
        Product product2=new Product("Corn","99994",30);
        Product product3=new Product("Soya sauce","99994",200);

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);

        shoppingCart.payment(new CreditCard("XYZ","1234567","899","11/25"));

         shoppingCart=new ShoppingCart();
         product1=new Product("Mobile","99994",30000);
         product2=new Product("Desktop","99994",50000);
         product3=new Product("AC","99994",10000);

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);
        shoppingCart.payment(new Paypal("abc@gmail.com","pass"));


    }
}
