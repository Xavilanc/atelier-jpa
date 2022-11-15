package com.wcs.atelierjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcs.atelierjpa.entity.Wilder;
import com.wcs.atelierjpa.repository.WilderRepository;

import java.util.List;

@RestController
public class WilderController {

    @Autowired
    WilderRepository repository;
    
    //create
    @RequestMapping("/create")
    public Wilder createWilder(String name, Integer age) {
        Wilder wilder = new Wilder(name, age);
        return repository.save(wilder);
    }

    //read by id
    @RequestMapping("/read")
    public Wilder getWilder(Long id) {
        return repository.findById(id).get();
    }

    //read all
    @RequestMapping("/readall")
    public List<Wilder> getAllWilders() {
        return repository.findAll();
    }

    //read by age
    @RequestMapping("/getByAge")
    public List<Wilder> getWildersByAge(Integer age) {
        return repository.findByAge(age);
    }

    //update
    @RequestMapping("/update")
    public Wilder updatWilder(Long id, String name, Integer age) {
        Wilder wilderToUpdate = repository.findById(id).get();
        if(name != null) {
            wilderToUpdate.setName(name);
        }
        if(age != null) {
            wilderToUpdate.setAge(age);
        }
        return repository.save(wilderToUpdate);
    }

    //delete
    @RequestMapping("/delete")
    public void deleteWilder(Long id) {
        repository.deleteById(id);
    }
}
