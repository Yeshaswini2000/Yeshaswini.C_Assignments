package com.valtech.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.valtech.tx.entity.Tx;

@Entity
@DiscriminatorValue("atx")
public class WithdrawalTx extends Tx {

	private int atmNo;
	private String location;

	public WithdrawalTx(float amount, boolean debit, LocalDateTime txTime, long accountId) {
		super(amount, debit, txTime, accountId);
	}

	public WithdrawalTx(float amount, boolean debit, LocalDateTime txTime, long accountId, int atmNo, String location) {
		super(amount, debit, txTime, accountId);
		this.atmNo = atmNo;
		this.location = location;
	}

	public int getAtmNo() {
		return atmNo;
	}

	@Override
	public String toString() {
		return "AtmTx [atmNo=" + atmNo + ", location=" + location + ", getId()=" + getId() + ", getAmount()="
				+ getAmount() + "]";
	}

	public void setAtmNo(int atmNo) {
		this.atmNo = atmNo;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
