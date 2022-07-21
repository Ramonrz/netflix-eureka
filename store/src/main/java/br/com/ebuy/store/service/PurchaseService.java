package br.com.ebuy.store.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.ebuy.store.dto.ProviderDto;
import br.com.ebuy.store.dto.PurchaseDto;

@Service
public class PurchaseService {

	private final static Logger LOGGER = Logger.getLogger(PurchaseService.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	public void purchaseItem(PurchaseDto purchase) {

		var exchange = restTemplate.exchange("http://provider/state/" + purchase.getAddress().getState(),
				HttpMethod.GET, null, ProviderDto.class);

		LOGGER.info(exchange.getBody().getAddress());
	}

}
