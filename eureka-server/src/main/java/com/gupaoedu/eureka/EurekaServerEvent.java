package com.gupaoedu.eureka;

import com.netflix.eureka.EurekaServerContext;
import com.netflix.eureka.EurekaServerContextHolder;
import org.springframework.cloud.netflix.eureka.server.event.*;
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
    public void onApplicationEvent(EurekaRegistryAvailableEvent availableEvent) {
        Echo.print(availableEvent.getSource() + " availableEvent  ");
    }
    /**
    *  Eureka客户端下线事件
     *  */
    @EventListener
    public void onApplicationEvent(EurekaInstanceCanceledEvent canceledEvent) {
        Echo.print(canceledEvent.getAppName() + " canceledEvent  ");
    }

    /**
     * Eureka服务端启动事件
     * */
    @EventListener
    public void onApplicationEvent(EurekaServerStartedEvent serverStartedEvent) {
        Echo.print(serverStartedEvent.getSource() + " serverStartedEvent  ");
    }
    /**
     * Eureka客户端续约事件
     * */
    @EventListener
    public void onApplicationEvent(EurekaInstanceRenewedEvent renewedEvent) {
        Echo.print(renewedEvent.getAppName() + " renewedEvent  ");
    }
    /**
     * Eureka客户端服务注册事件
     * */
    @EventListener
    public void onApplicationEvent(EurekaInstanceRegisteredEvent registeredEvent) {
        Echo.print(registeredEvent.getInstanceInfo().getAppName() + " registeredEvent  ");
    }

}