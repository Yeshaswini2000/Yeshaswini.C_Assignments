package com.valtech.tx.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import com.valtech.tx.entity.Tx;



@Entity
@DiscriminatorValue("ctx")
public class ChequeTx extends Tx {

	private int chequeNo;

	private boolean outstation;
	private float collectionCharges;


	public ChequeTx(float amount, boolean debit, LocalDateTime txTime, long accountId) {
		super(amount, debit, txTime, accountId);
	}

	public ChequeTx(float amount, boolean debit, LocalDateTime txTime, long accountId, int chequeNo, boolean outstation,
			float collectionCharges) {
		super(amount, debit, txTime, accountId);
		this.chequeNo = chequeNo;
		this.outstation = outstation;
		this.collectionCharges = collectionCharges;
	}

	public int getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}

	public boolean isOutstation() {
		return outstation;
	}

	public void setOutstation(boolean outstation) {
		this.outstation = outstation;
	}

	public float getCollectionCharges() {
		return collectionCharges;
	}

	public void setCollectionCharges(float collectionCharges) {
		this.collectionCharges = collectionCharges;
	}

	@Override
	public String toString() {
		return "CheckTx [chequeNo=" + chequeNo + ", outstation=" + outstation + ", collectionCharges="
				+ collectionCharges + ", getId()=" + getId() + ", getAmount()=" + getAmount() + "]";
	}

}
