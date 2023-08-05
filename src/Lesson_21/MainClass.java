package Lesson_21;

public class MainClass {
    public static void main(String[] args) {
        Order order = new Order(1, OrderStatus.PROCESSING);
        System.out.println(order.getOrderStatus());
        order.setOrderStatus(OrderStatus.SHIPPED);
        System.out.println(order.getOrderStatus());


    }
}
