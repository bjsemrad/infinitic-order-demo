package net.semrad.order

import java.time.Instant

class OrderStatusHistory {
    var status: OrderStatusCode? = null
    var reason: String? = null
    var date: Instant? = null
}
