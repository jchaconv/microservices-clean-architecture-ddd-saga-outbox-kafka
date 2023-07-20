package com.food.ordering.system.order.service.domain.ports.input.message.listener.restaurant;

import com.food.ordering.system.order.service.domain.dto.message.RestaurantApprovalResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Slf4j
@Service
public class RestaurantApprovalListenerImpl implements RestaurantApprovalListener {

    @Override
    public void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse) {

    }

    @Override
    public void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse) {

    }
}
