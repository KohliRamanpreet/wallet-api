package com.wallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wallet.model.userDetails;

@Repository
public interface UserRepository extends CrudRepository<userDetails, Integer> {
}
