package cap13_comp_enum.aula147_enum.application;

import cap13_comp_enum.aula147_enum.application.entities.Order;
import cap13_comp_enum.aula147_enum.application.entities.enums.OrderStatus;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Order order = new Order(1000, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os1.name());
        System.out.println(os2);
    }
}
