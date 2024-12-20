package net.semrad.services

import io.infinitic.annotations.Name
import net.semrad.order.Order

@Name("OrderIntake")
interface IntakeOrder {

    fun IntakeOrder(order: Order): Order;
}