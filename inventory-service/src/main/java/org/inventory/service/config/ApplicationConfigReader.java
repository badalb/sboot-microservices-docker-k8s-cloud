package org.inventory.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfigReader {

	@Value("${app.exchange.name}")
	private String appExchange;

	@Value("${app.queue.name}")
	private String appQueue;

	@Value("${app.routing.key}")
	private String appRoutingKey;

	public String getAppExchange() {
		return appExchange;
	}

	public String getAppQueue() {
		return appQueue;
	}

	public String getAppRoutingKey() {
		return appRoutingKey;
	}

}
