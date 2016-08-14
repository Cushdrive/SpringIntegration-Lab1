package com.intertech.lab1;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

import java.io.File;

/**
 * Created by jayson on 8/14/16.
 */
public class FileSelector implements MessageSelector {
    public boolean accept(Message<?> message) {
        if ((message.getPayload() instanceof File)
                && ((File) message.getPayload()).getName().startsWith("msg")) {
            return false;
        }
        return true;
    }
}
