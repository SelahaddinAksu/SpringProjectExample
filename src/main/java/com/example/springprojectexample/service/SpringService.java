package com.example.springprojectexample.service;

import com.example.springprojectexample.model.Spring;
import com.example.springprojectexample.repository.SpringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class SpringService {

    @Autowired
    private SpringRepository springRepository;

    public List<Spring> getAllSpring(){
        return springRepository.findAll();
    }
    public Spring getSpringById(Long id){
        return springRepository.findById(id).orElse(null);
    }
    public void addSpring(Spring spring){
        springRepository.save(spring);
    }
    public void updateSpring(Spring spring){
        springRepository.save(spring);
    }
    public void deleteSpring(Long id){
        springRepository.deleteById(id);
    }
}
