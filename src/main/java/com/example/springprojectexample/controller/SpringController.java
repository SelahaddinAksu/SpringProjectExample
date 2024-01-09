package com.example.springprojectexample.controller;


import com.example.springprojectexample.model.Spring;
import com.example.springprojectexample.service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring")
public class SpringController {
    @Autowired
    SpringService springService;

    @GetMapping
    public List<Spring> getAllSpring() {
        return springService.getAllSpring();
    }

    @GetMapping("/{id}")
    public Spring getSpringById(@PathVariable Long id) {
        return springService.getSpringById(id);
    }

    @PostMapping
    public void addSpring(@RequestBody Spring spring) {
        springService.addSpring(spring);
    }

    @PutMapping("/{id}")
    public void updateSpring(@PathVariable Long id, @RequestBody Spring spring) {
        Spring existingSpring = springService.getSpringById(id);
        if(existingSpring != null){
            existingSpring.setTitle(spring.getTitle());
            existingSpring.setAuthor(spring.getAuthor());
            existingSpring.setSpring(spring.getSpring());
            springService.updateSpring(existingSpring);
        }
    }
    @DeleteMapping("/{id}")
    public void deleteSpring(@PathVariable Long id){

        springService.deleteSpring(id);
    }
}
