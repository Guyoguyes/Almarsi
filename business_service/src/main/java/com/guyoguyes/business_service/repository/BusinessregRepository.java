package com.guyoguyes.business_service.repository;

import com.guyoguyes.business_service.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessregRepository extends JpaRepository<Business, Long> {
}
