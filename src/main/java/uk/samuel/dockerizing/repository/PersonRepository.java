package uk.samuel.dockerizing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.samuel.dockerizing.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
