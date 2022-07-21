package br.com.ebuy.provider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ebuy.provider.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {

	State findByState(String state);
}
