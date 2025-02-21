package main.java.com.semicolon.africa.model;

public class CreditCardInformation {
    private String cvv;
    public int expirationYear;
    public int expirationMonth;
    public String creditCardNumber;
    public String nameOnCard;
    public CardType cardType;

    public CreditCardInformation(String cvv, int expirationYear, int expirationMonth,
                                 String creditCardNumber, String nameOnCard, CardType cardType) {
        this.cvv = cvv;
        this.expirationYear = expirationYear;
        this.expirationMonth = expirationMonth;
        this.creditCardNumber = creditCardNumber;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }
}


