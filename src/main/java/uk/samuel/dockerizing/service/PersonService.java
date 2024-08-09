package uk.samuel.dockerizing.service;

import uk.samuel.dockerizing.entity.Person;
import uk.samuel.dockerizing.payload.request.RequestNameDto;

import java.util.List;

public interface PersonService {

    void saveNew(RequestNameDto requestNameDto);

    List<Person> getPersons();
}
