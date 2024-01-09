package com.java.e_commerce.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.java.e_commerce.models.Category;

@Repository
public interface CategoryRepo extends ReactiveMongoRepository<Category, String> {

}
