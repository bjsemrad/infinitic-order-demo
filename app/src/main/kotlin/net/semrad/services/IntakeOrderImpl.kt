package net.semrad.services

import net.semrad.order.Order

class IntakeOrderImpl : IntakeOrder {
    override fun IntakeOrder(order: Order): Order {
        order.orderNumber = (Math.random() * 100000).toString();
        return order;
    }
}