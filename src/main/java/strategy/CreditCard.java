package strategy;

public class CreditCard implements PaymentMethod{

    //credit card details

    private String cardHolderName;
    private String cardNo;
    private String cvv;
    private String dateOfExpiry;

    public CreditCard(String cardHolderName, String cardNo, String cvv, String dateOfExpiry) {
        this.cardHolderName = cardHolderName;
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying via credit card---- Rs. "+amount);
    }
}
