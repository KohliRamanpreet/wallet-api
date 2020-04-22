package com.wallet.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wallet.model.transactionDetails;

@Repository
public interface transactionDetailRepository extends CrudRepository<transactionDetails, Integer>{

}
