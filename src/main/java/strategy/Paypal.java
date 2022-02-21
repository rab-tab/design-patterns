package strategy;

public class Paypal implements PaymentMethod{

    private String email;
    private String password;

    @Override
    public void pay(int amount) {
        System.out.println("Paying via paypal -- Rs. "+amount);
    }

    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
