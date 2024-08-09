package uk.samuel.dockerizing.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uk.samuel.dockerizing.entity.Person;
import uk.samuel.dockerizing.payload.request.RequestNameDto;
import uk.samuel.dockerizing.repository.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{

    private final PersonRepository personRepository;

    @Override
    public void saveNew(RequestNameDto requestNameDto) {
        Person person = new Person();
        person.setName(requestNameDto.getName());
        personRepository.save(person);
    }

    @Override
    public List<Person> getPersons() {
        List<Person> personList = personRepository.findAll();
        return personList;
    }
}
