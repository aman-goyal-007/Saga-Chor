package com.aman.dto;

import com.aman.events.order.OrderStatus;
import lombok.Data;

import java.util.UUID;

@Data
public class OrderResponseDto {

    private UUID orderId;
    private Integer productId;
    private Integer userId;
    private Integer amount;
    private OrderStatus orderStatus;
}
