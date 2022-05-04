package com.guyoguyes.business_service.service;

import com.guyoguyes.business_service.model.Business;
import com.guyoguyes.business_service.repository.BusinessregRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BusinessRegService {

    public BusinessregRepository businessRepo;

    public Business registerBusiness(Business business){
        Business newBusiness = businessRepo.save(
                Business.builder()
                        .name(business.getName())
                        .description(business.getDescription())
                        .type(business.getType())
                        .email(business.getEmail())
                        .mobile(business.getMobile())
                        .build()

        );
        return newBusiness;
    }

}
