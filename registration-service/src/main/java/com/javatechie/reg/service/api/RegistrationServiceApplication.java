package com.javatechie.reg.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import com.javatechie.reg.service.api.dao.UserRepository;
import com.javatechie.reg.service.api.model.User;

import java.lang.reflect.Array;
import java.util.List;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class RegistrationServiceApplication {

    @Autowired
    private UserRepository repository;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        List<User> users = repository.findAll();
        if(user.getType().equals("pf")){
            for(User userCompar: users){
                if(user.getCpf() == userCompar.getCpf()){
                    return "Hi " + user.getName() + " this CPF is already in use, please use another one.";
                }
            }
        } else {
            for(User userCompar: users){
                if(user.getCnpj() == userCompar.getCnpj()){
                    return "Hi " + user.getName() + " this CNPJ is already in use, please use another one.";
                }
            }
        }
        repository.save(user);
        return "Hi " + user.getName() + " your Registration process successfully completed";
    }
    
    @GetMapping("/getAllUsers")
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/findUser/{name}")
    public List<User> findUser(@PathVariable String name) {
        return repository.findByName(name);
    }

    @DeleteMapping("/cancel/{id}")
    public List<User> cancelRegistration(@PathVariable int id) {
        repository.deleteById(id);
        return repository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(RegistrationServiceApplication.class, args);
    }

}


