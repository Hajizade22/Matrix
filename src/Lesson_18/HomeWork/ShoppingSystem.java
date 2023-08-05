package Lesson_18.HomeWork;

public class ShoppingSystem {
    int number;
    String nameOfProduct;
    int quantity;
    int price;
    int totalAmount;

    public ShoppingSystem(int number ,String nameOfProduct, int quantity, int price) {
        this.number=number;
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
        this.price = price;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }



    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalAmount() {
        return price*quantity;
    }

    @Override
    public String toString() {
        return "Sıra nömrəsi " + number + " ,"+" Məhsulun adı "+ nameOfProduct+ " ," +" Məhsulun qiyməti  " +price + " ₼"+" ," + " Stock " + quantity  ;



    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
