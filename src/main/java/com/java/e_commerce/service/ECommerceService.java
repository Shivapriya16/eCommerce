package com.java.e_commerce.service;

import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;

import com.java.e_commerce.repositories.E_CommerceRepo;

@Service
public class ECommerceService {

    E_CommerceRepo eCommerceRepo;

    ReactiveMongoTemplate mongoTemplate;

    public ECommerceService() {

    }

    public ECommerceService(E_CommerceRepo eCommerceRepo) {
        this.eCommerceRepo = eCommerceRepo;
    }

    public ECommerceService(E_CommerceRepo eCommerceRepo, ReactiveMongoTemplate mongoTemplate) {
        this.eCommerceRepo = eCommerceRepo;
        this.mongoTemplate = mongoTemplate;
    }

}