package com.guyoguyes.business_service.controller;

import com.guyoguyes.business_service.model.Business;
import com.guyoguyes.business_service.service.BusinessRegService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/business")
@AllArgsConstructor
public class BusinessController {

    private final BusinessRegService businessRegService;

    @PostMapping
    public ResponseEntity<Business> registerBusiness(@RequestBody Business business){
        Business newBusiness = businessRegService.registerBusiness(business);
        return new ResponseEntity<>(newBusiness, HttpStatus.CREATED);
    }
}
