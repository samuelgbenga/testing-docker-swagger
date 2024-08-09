package uk.samuel.dockerizing.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.samuel.dockerizing.entity.Person;
import uk.samuel.dockerizing.payload.request.RequestNameDto;
import uk.samuel.dockerizing.service.PersonService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @PostMapping("/new")
    public ResponseEntity<String> createNew(@RequestBody RequestNameDto requestNameDto){
        personService.saveNew(requestNameDto);
        return ResponseEntity.ok("Name Created Successful");
    }

    // get the list of names
    @GetMapping("/get")
    public ResponseEntity<List<Person>> getPersons(){
        return ResponseEntity.ok(personService.getPersons());
    }
}
