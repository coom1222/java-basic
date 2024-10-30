package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int countOrder = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[countOrder];
        for (int i = 0; i < orders.length; i++) {   // orders.length - 배열의 크기만큼
            System.out.println((i+1) + "번째 주문 정보를 입력하세요");

            System.out.print("상품명: ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();
            scanner.nextLine();

            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        getTotalAmount(orders);

    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder order : orders){
            System.out.println("상품명: " + order.productName + ", 가격: " +order.price + ", 수량: " + order.quantity);
        }
    }

    static void getTotalAmount(ProductOrder[] orders){
        int totalProductOrders = 0;
        for(ProductOrder order : orders){
            totalProductOrders += order.quantity * order.price;
        }
        System.out.println("총 결제 금액: " + totalProductOrders);
    }
}
