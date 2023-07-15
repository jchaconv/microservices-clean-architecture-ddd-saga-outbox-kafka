package com.food.ordering.system.ports.input.message.listener.restaurant;

public interface RestaurantApprovalResponse {

    void orderApproved(com.food.ordering.system.dto.message.RestaurantApprovalResponse restaurantApprovalResponse);

    void orderRejected(com.food.ordering.system.dto.message.RestaurantApprovalResponse restaurantApprovalResponse);

}
