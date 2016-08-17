package com.intertech.lab1;

import com.intertech.domain.Shiporder;
import org.springframework.messaging.Message;

/**
 * Created by jayson on 8/16/16.
 */
public class ShipOrderEnricher {

    public double computeTotal (Message<Shiporder> order) {
        double sum = 0;
        for (Shiporder.Item item : order.getPayload().getItem()) {
            sum += (item.getPrice().doubleValue() * item.getQuantity().intValue());
        }
        return sum;
    }
}
