package com.aman.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
public class OrderRequestDto {

    private UUID orderId;
    private Integer productId;
    private Integer userId;
}
