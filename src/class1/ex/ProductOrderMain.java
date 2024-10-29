package class1.ex;

public class ProductOrderMain {

    public static void main(String[] args) {

        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        ProductOrder productOrder3 = new ProductOrder();
        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;

        // ProductOrder 이라는 타입이기 때문에 타입을 묶어서 하나의 변수로 사용할 수 있다.
        // ProductOrder 타입의 배열객체 생성.
        // String orders 라 하면 스트링 타입의 orders이름 배열 생성.
        ProductOrder[] orders = {productOrder1, productOrder2, productOrder3};
        /*
        아래의 내용을 위 한줄의 코드로 끝낼 수 있다.
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = productOrder1;
        orders[1] = productOrder2;
        orders[2] = productOrder3;
        단축키 - opt + cmd + /
        */
        int totalPrice = 0;
        for(ProductOrder order : orders) {
            totalPrice += (order.price*order.quantity);
        }

        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " +order.price + ", 수량: " + order.quantity);
        }

        System.out.println("총 결제 금액: " + totalPrice);

    }
}
