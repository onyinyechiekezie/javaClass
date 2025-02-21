package main.java.com.semicolon.africa.model;

public class Product {
    public String productId;
    public String productName;
    public double price;
    public String productDescription;
    public ProductCategory category;


    public Product(String productId, String productName, double price, String productDescription, ProductCategory category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.category = category;
    }
}


