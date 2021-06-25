package com.aman.events.order;

import com.aman.dto.PurchaseOrderDto;
import com.aman.events.Event;

import java.util.Date;
import java.util.UUID;

public class OrderEvent implements Event {
    private final UUID eventId =UUID.randomUUID();
    private final Date date = new Date();
    private PurchaseOrderDto purchaseOrder;
    private OrderStatus orderStatus;

    private OrderEvent(){

    }

    public OrderEvent(PurchaseOrderDto purchaseOrder, OrderStatus orderStatus) {
        this.purchaseOrder = purchaseOrder;
        this.orderStatus = orderStatus;
    }

    @Override
    public UUID getEventId() {
        return this.eventId;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    public PurchaseOrderDto getPurchaseOrder() {
        return purchaseOrder;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }
}
