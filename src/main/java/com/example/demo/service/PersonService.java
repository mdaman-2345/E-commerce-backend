package com.example.demo.service;

import com.example.demo.dao.PersonDao;
import com.example.demo.dao.PersonDto;
import com.example.demo.model.Loginuser;
import com.example.demo.model.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonDao personDao;

    public String addPerson(PersonDto person) {
       return fieldMapper(person);
    }

    public List<Person> getAllPerson(){
        return personDao.findAll();
    }

    public Optional<Person> selectById(Long id){
        return personDao.findById(id);
    }

    public Person loginStatus(Loginuser User){
        System.out.println(User.getEmail());

        Person loggedPerson=personDao.findByEmail(User.getEmail());


        if(loggedPerson!=null){
            if(loggedPerson.getPassword().equals(User.getPassword())) {
                return loggedPerson;
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }


    private String  fieldMapper(PersonDto person){
        Person person1 = new Person();
        person1.setName(person.getName());
        person1.setCpassword(person.getCpassword());
        person1.setEmail(person.getEmail());
        person1.setPassword(person.getPassword());
        Person loggedPerson=personDao.findByEmail(person.getEmail());
        if(loggedPerson !=null){
            return "User is already present";
        }
        else {
            personDao.save(person1);
            return "Registration Successfull";
        }
    }


}
