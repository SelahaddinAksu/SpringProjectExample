package com.example.springprojectexample.repository;

import com.example.springprojectexample.model.Spring;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringRepository extends JpaRepository<Spring,Long> {

}
