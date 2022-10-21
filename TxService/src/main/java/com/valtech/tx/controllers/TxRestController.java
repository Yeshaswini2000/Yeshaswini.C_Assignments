package com.valtech.tx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.valtech.tx.entity.Tx;
import com.valtech.tx.service.TxService;

@RestController
public class TxRestController {
	
	@Autowired
	private TxService txService;
	
	@PostMapping("/api/txss")
	public Tx createTxs(@RequestBody Tx tx) {
		return txService.createTx(tx);
	}

	@GetMapping("api/txs")
	public List<Tx> getTxs() {
		return txService.getAllTxs();
	}

	@GetMapping("/api/txs/{id}")
	public Tx getTx(@PathVariable("id") long id) {
		return txService.getTx(id);

	}
	

}
