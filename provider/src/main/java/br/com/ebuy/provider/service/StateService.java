package br.com.ebuy.provider.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ebuy.provider.model.State;
import br.com.ebuy.provider.repository.StateRepository;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;

	public State getInfoState(String state) {
		return stateRepository.findByState(state);
	}

}
