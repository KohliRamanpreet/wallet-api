package com.wallet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wallet.model.loginDetails;

@Repository
public interface loginDetailsRepository extends CrudRepository<loginDetails, Integer> {

}
