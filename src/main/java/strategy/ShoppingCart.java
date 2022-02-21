package strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        products=new ArrayList<Product>();
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void deleteProduct(Product product)
    {
        products.remove(product);
    }

    private int calculateTotalPrice()
    {
        return products.stream().map(p->p.getPrice()).reduce(0,Integer::sum);
    }

    public void payment(PaymentMethod paymentMethod)
    {
        paymentMethod.pay(calculateTotalPrice());
    }
}
