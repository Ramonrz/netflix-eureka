package br.com.ebuy.provider.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ebuy.provider.model.State;
import br.com.ebuy.provider.service.StateService;

@RestController
@RequestMapping("/state")
public class StateApi {

	@Autowired
	private StateService stateService;

	@GetMapping("/{state}")
	public State getState(@PathVariable String state) {
		return stateService.getInfoState(state);
	}

}
