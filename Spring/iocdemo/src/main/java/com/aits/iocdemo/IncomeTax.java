package com.aits.iocdemo;

public class IncomeTax implements Tax {
	
	
	public double taxPayableAmount;
	public double getTaxAmount;
	public boolean isTaxPaid=false;
	public String taxType="savings";

	@Override
	public void setTaxableAmount(double amount) {
		this.getTaxAmount=amount;
	}

	@Override
	public void CalculateTaxAmount() {
			
	}

	@Override
	public double getTaxAmount() {
		return this.getTaxAmount;
	}

	@Override
	public String getTaxType() {
		return this.taxType;
	}

	@Override
	public boolean isTaxPaid() {
		return this.isTaxPaid;
	}
	
}
