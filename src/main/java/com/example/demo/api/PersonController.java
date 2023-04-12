package com.example.demo.api;

import com.example.demo.dao.PersonDto;
import com.example.demo.model.Loginuser;
import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@AllArgsConstructor
public class PersonController {
    private final PersonService personService;

//    @RequestMapping
    @PostMapping("api/v1/person")
    public String addPerson(@RequestBody PersonDto person){
        return personService.addPerson(person);
    }

//    @RequestMapping
    @GetMapping("api/v1/person")
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }
//    @RequestMapping("")
    @GetMapping("api/v1/person/{id}")

    public Person getPersonById(@PathVariable("id") Long id){
        return personService.selectById(id).orElse(null);
    }

//    @RequestMapping
    @PostMapping("login")
    public Person loginStatus(@RequestBody Loginuser User){
        return personService.loginStatus(User);
    }


}
