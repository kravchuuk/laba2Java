package ua.lviv.iot.model;

public class Product {
    public ProductName productName;
    public ProductType productType;
    public int price;
    public String volume;
    public String producer;


    public Product(ProductName productName, ProductType productType, int price, String temperature, String producer) {
        this.productName = productName;
        this.productType = productType;
        this.price = price;
        this.volume = temperature;
        this.producer = producer;
    }

    public ProductName getProductName() {
        return productName;
    }

    public void setProductName(ProductName productName) {
        this.productName = productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName=" + productName +
                ", productType=" + productType +
                ", price=" + price +
                ", temperature='" + volume + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }

}
