package net.semrad.workflow

import io.infinitic.workflows.Workflow
import net.semrad.order.Order
import net.semrad.services.IntakeOrder

class OrderWorkflowImpl: Workflow(), OrderWorkflow {

    private var intakeService = newService(IntakeOrder::class.java)

    override fun ProcessOrder(order: Order): Order {
        var currentOrder = order;
        if (order.orderNumber.isNullOrEmpty()) {
            currentOrder = intakeService.IntakeOrder(order);
        }
        return currentOrder;
    }

}