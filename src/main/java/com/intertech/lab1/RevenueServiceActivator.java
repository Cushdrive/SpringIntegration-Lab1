package com.intertech.lab1;

import com.intertech.domain.Shiporder;
import org.springframework.messaging.Message;

/**
 * Created by jayson on 8/20/16.
 */
public class RevenueServiceActivator {

    private double revenue = 0.0;

    public Message<Shiporder> adjustRevenue(Message<Shiporder> order) {
        System.out.println("Processing Order.");
        for (Shiporder.Item item : order.getPayload().getItem()) {
            revenue += (item.getPrice().doubleValue() * item.getQuantity().intValue());
            System.out.println("Revenue now up to: " + revenue);
        }
        System.out.println("Done processing order.");
        return order;
    }
}
