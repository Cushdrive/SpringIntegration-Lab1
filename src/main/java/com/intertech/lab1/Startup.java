package com.intertech.lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Startup {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"/META-INF/spring/si-components.xml");
        String serviceOutput = null;
		
//		MessageChannel channel = context.getBean("requestChannel", MessageChannel.class);
//		Message<String> message = MessageBuilder.withPayload("Hello brave new world").build();
//		channel.send(message);

        PigLatinService service = context.getBean("latinService",PigLatinService.class);
        Future<String> asynchResponse = service.translate("Hello brave world.");
        //This is where more work would be done while the asynchronous operation was taking place.
        try {
            System.out.println("Blah");
            System.out.println("Blah");
            System.out.println("Blah");
            System.out.println("Blah");
            System.out.println("Blah");
            serviceOutput = asynchResponse.get(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println(serviceOutput);

        context.close();
	}
}
