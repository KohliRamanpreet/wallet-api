package com.wallet.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.wallet.model.loginDetails;
import com.wallet.model.transactionDetails;
import com.wallet.model.userDetails;
import com.wallet.repository.UserRepository;
import com.wallet.repository.loginDetailsRepository;
import com.wallet.repository.transactionDetailRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class WalletController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private loginDetailsRepository ldRepo;
	@Autowired
	private transactionDetailRepository tdRepo;

	@PostMapping("/add")
	public void add(@RequestBody userDetails user) {
		loginDetails ld = new loginDetails();
		ld.setUser(user);
		ldRepo.save(ld);
		transactionDetails td = new transactionDetails();
		td.setUser(user);
		tdRepo.save(td);
		userRepository.save(user);
	}

	@GetMapping("/fetch")
	public List<userDetails> getUsers() {
		return (List<userDetails>) userRepository.findAll();

	}
	@GetMapping("/fetchtransaction")
	public List<transactionDetails> getTransaction()
	{
		return (List<transactionDetails>) tdRepo.findAll();
	}

}