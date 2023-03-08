package br.com.etec.richard.rentalAPI.repository;

import br.com.etec.richard.rentalAPI.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
