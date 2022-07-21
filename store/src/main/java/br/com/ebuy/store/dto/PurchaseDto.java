package br.com.ebuy.store.dto;

import java.util.List;

public class PurchaseDto {

	private List<PurchaseItemDto> itens;

	private AddressDto address;

	public List<PurchaseItemDto> getItens() {
		return itens;
	}

	public void setItens(List<PurchaseItemDto> itens) {
		this.itens = itens;
	}

	public AddressDto getAddress() {
		return address;
	}

	public void setAddress(AddressDto address) {
		this.address = address;
	}

}
