package com.software.architecture.gateways.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

	@Bean
	public RouteLocator route(RouteLocatorBuilder builder) {
		return builder.routes().
				route(r -> r
						.path("/anything/**")
						.uri("http://httpbin.org/anything"))
				.build();

	}
}
