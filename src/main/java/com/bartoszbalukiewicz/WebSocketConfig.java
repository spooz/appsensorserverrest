package com.bartoszbalukiewicz;

import org.owasp.appsensor.core.AppSensorClient;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * Created by Bartek on 02.10.2016.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(value="org.owasp.appsensor", excludeFilters = @ComponentScan.Filter(value = AppSensorClient.class, type = FilterType.ASSIGNABLE_TYPE))
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}
