package com.gupaoedu.eureka;

import com.netflix.eureka.EurekaServerContext;
import com.netflix.eureka.EurekaServerContextHolder;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaRegistryAvailableEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaServerEvent  {

    /**
     * 参考EurekaController类中的populateApps方法，获取当前所有服务列表
     * */
    public EurekaServerContext getServerContext() {
        return EurekaServerContextHolder.getInstance().getServerContext();
    }

    /**
     * Eureka服务端可用事件
     * */
    @EventListener
    public void onApplicationEvent(EurekaRegistryAvailableEvent canceledEvent) {

    }
    /**
    *  Eureka服务端启动事件
     *  */
    @EventListener
    public void onApplicationEvent(EurekaInstanceCanceledEvent canceledEvent) {
        Echo.print(canceledEvent.getAppName() + " start");
    }

    @EventListener
    public void onApplicationEvent(EurekaServerStartedEvent canceledEvent) {

    }
}
