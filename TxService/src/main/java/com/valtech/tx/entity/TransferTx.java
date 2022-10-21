package com.valtech.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.valtech.tx.entity.Tx;

@Entity
@DiscriminatorValue("ttx")
public class TransferTx extends Tx {
	private String teller;
	private String branch;

	public TransferTx(float amount, boolean debit, LocalDateTime txTime, long accountId) {
		super(amount, debit, txTime, accountId);
	}

	public TransferTx(float amount, boolean debit, LocalDateTime txTime, long accountId, String teller, String branch) {
		super(amount, debit, txTime, accountId);
		this.teller = teller;
		this.branch = branch;
	}

	public String getTeller() {
		return teller;
	}

	public void setTeller(String teller) {
		this.teller = teller;
	}

	public String getBranch() {
		return branch;
	}

	@Override
	public String toString() {
		return "TellerTx [teller=" + teller + ", branch=" + branch + ", getId()=" + getId() + ", getAmount()="
				+ getAmount() + "]";
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
