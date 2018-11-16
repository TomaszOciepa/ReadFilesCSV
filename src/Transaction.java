import java.math.BigDecimal;

public class Transaction {

    private String city;
    private BigDecimal price;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "city='" + city + '\'' +
                ", price=" + price +
                '}';
    }
}
