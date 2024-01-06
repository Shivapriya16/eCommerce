package com.java.e_commerce.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.java.e_commerce.model.Ecommerce;

@Repository
public interface E_CommerceRepo extends ReactiveMongoRepository<Ecommerce, String> {

}
