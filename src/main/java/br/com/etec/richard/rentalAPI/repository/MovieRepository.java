package br.com.etec.richard.rentalAPI.repository;

import br.com.etec.richard.rentalAPI.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
