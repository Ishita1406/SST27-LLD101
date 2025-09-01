package com.example.orders;

import java.util.List;

public class OrderService {

    public Order createOrder(String id, String email, List<OrderLine> lines, Integer discount, boolean expedited, String notes) {
        Order o = new Order.Builder(id, email, lines.get(0))
        .addLine(lines.get(0))
        .discountPercent(discount)
        .expedited(expedited)
        .notes(notes)
        .build();

        return o;
    }
}