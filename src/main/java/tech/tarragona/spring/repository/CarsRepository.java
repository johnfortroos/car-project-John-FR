package tech.tarragona.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.tarragona.spring.model.Cars;
@Repository
public interface CarsRepository extends JpaRepository<Cars, String> {

	Cars findByMatricula(String matricula);

}
