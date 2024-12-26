package extends1.ex;

public class Item {

    private String name;
    private int price;

    // 아이템을 만들때 필요한 생성자
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void print() {
        System.out.println("이름: " + name + ", 가격:" + price);
    }
}
