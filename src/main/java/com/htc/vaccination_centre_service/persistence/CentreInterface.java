package com.htc.vaccination_centre_service.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.vaccination_centre_service.entity.Centre;



public interface CentreInterface extends JpaRepository<Centre, Long>{

	Centre findBycentreName(String centreName);

	Centre findBycentreAddress(String centreAddress);

	Centre findBypincode(Long pincode);

}
