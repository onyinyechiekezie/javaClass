package main.java.com.semicolon.africa.model;

public class BillingInformation {
    public String receiverPhone;
    public String receiverName;
    public Address deliveryAddress;
    public CreditCardInformation creditCardInfo;


    public BillingInformation(String receiverPhone, String receiverName, Address deliveryAddress,
                              CreditCardInformation creditCardInfo) {
        this.receiverPhone = receiverPhone;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
        this.creditCardInfo = creditCardInfo;
    }
}

