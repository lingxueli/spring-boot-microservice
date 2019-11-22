package com.example.dogMicroservice.repository;

import com.example.dogMicroservice.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {

}
