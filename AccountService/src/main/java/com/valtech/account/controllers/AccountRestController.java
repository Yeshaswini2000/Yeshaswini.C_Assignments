package com.valtech.account.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.account.entity.Account;
import com.valtech.account.service.AccountService;

@RestController
public class AccountRestController {

	@Autowired
	private AccountService accountService;

	@PutMapping("/api/accounts/{id}")
	public Account updateAccount(@PathVariable("id") long id, @RequestBody Account account) {
		return accountService.updateAccount(account);

	}

	@PostMapping("/api/accounts")
	public Account createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}

	@GetMapping("api/accounts")
	public List<Account> getAccounts() {
		return accountService.getAllAccounts();
	}

	@GetMapping("/api/accounts/{id}")
	public Account getAccount(@PathVariable("id") long id) {
		return accountService.getAccount(id);
	}

	@PostMapping("/api/accounts/SB/")
	public Account createSavingsAccount(@RequestParam("balance") double balance) {
		return accountService.createSavingsAccount(balance);

	}

	@PostMapping("/api/accounts/CA/")
	public Account createCurrentAccount(@RequestParam("balance") double balance) {
		return accountService.createCurrentAccount(balance);
	}

}
