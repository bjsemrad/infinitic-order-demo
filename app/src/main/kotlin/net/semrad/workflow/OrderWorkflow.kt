package net.semrad.workflow

import io.infinitic.annotations.Name
import net.semrad.order.Order

@Name("OrderWofklow")
interface OrderWorkflow {

    fun ProcessOrder(order: Order): Order;
}