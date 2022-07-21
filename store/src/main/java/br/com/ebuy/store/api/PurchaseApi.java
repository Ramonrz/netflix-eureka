package br.com.ebuy.store.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ebuy.store.dto.PurchaseDto;
import br.com.ebuy.store.service.PurchaseService;

@RestController
@RequestMapping("/purchase")
public class PurchaseApi {

	@Autowired
	private PurchaseService purchaseService;

	@PostMapping
	public void purchaseItem(@RequestBody PurchaseDto purchaseDto) {
		purchaseService.purchaseItem(purchaseDto);
	}

}
