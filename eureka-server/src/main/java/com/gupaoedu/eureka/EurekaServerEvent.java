package com.gupaoedu.eureka;

import com.netflix.eureka.EurekaServerContext;
import com.netflix.eureka.EurekaServerContextHolder;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaServerEvent  {

    private EurekaServerContext getServerContext() {
        return EurekaServerContextHolder.getInstance().getServerContext();
    }

    @EventListener
    public void onApplicationEvent(EurekaInstanceCanceledEvent canceledEvent) {
        System.out.println(canceledEvent.getAppName());

    }

}
