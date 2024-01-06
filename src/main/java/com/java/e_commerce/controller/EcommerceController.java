package com.java.e_commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.e_commerce.repositories.E_CommerceRepo;
import com.java.e_commerce.service.ECommerceService;

@RestController
@RequestMapping(produces = "application/json")
public class EcommerceController {

    @Autowired
    E_CommerceRepo eCommerceRepo;

    @Autowired
    ReactiveMongoTemplate mongoTemplate;

    //
    @PostMapping("/flightDetails")
    public ResponseEntity<?> collectDetails() {
        try {
            ECommerceService service = new ECommerceService(eCommerceRepo);
            // service.SaveInitialData(request);
            return new ResponseEntity<String>(("success"), HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<Error>(HttpStatus.BAD_REQUEST);
        }
    }

}