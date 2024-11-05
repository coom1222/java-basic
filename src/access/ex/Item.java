package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    // 생성자는 public으로
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Item의 이름을 반환하기.
    public String getName() {
        return name;
    }

    // 어
    public int getTotalPrice() {
        return price * quantity;
    }
}
