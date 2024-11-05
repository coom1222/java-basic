package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];    // 10개까지 담을 수 있는 배열
    private int itemCount;  // 초깃값 0

    // 상품등록
    public void addItem(Item item) {
        // 검증로직
        if (itemCount >= items.length) {    // 10개이상 못들어가므로
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        // 실행로직
        items[itemCount] = item;
        itemCount++;
    }

    // 이러면 배열을 돌면서 그 배열의 요소를 참조한다.
    public void displayItems() {
        for (int i = 0; i < itemCount; i++) {   // 배열만큼 도는게 아니라 담긴 애들만 도는거니까
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
            System.out.println("전체가격합: " + calculateTotalPrice());
        }
    }

    // 전체 가격 합
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
